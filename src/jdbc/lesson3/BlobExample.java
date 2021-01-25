package jdbc.lesson3;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.*;

public class BlobExample {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:postgresql://localhost:5432/itvdn_db";
        String userName = "postgres";
        String userPassword = "postgres";
        Class.forName("org.postgresql.Driver");

        try(Connection conn = DriverManager.getConnection(url, userName, userPassword);
            Statement statement = conn.createStatement()){
            statement.executeUpdate("CREATE TABLE IF NOT EXISTS public.images(id SERIAL PRIMARY KEY, name TEXT, date DATE, image BYTEA)");

            PreparedStatement preparedStatement = null;
            try{
                BufferedImage image = ImageIO.read(new File("E:\\JAVA\\ITVDNJava\\src\\jdbc\\lesson3\\smale.jpg"));
                // got an error Method org.postgresql.jdbc.PgConnection.createBlob() is not yet implemented. :
                Blob smile = conn.createBlob();
                try(OutputStream outputStream = smile.setBinaryStream(1)){
                    ImageIO.write(image, "jpg", outputStream);
                }
                preparedStatement = conn.prepareStatement("INSERT INTO public.images(name, date, image) VALUES (?, {d ?}, ?)");
                preparedStatement.setString(1, "Smile");
                preparedStatement.setDate(2, Date.valueOf("2020-01-24"));
                preparedStatement.setBlob(3, smile);
                preparedStatement.execute();

                ResultSet resultSet = null;
                try{
                    resultSet = preparedStatement.executeQuery("SELECT * FROM public.images");
                    while(resultSet.next()){
                        Blob newSmile = resultSet.getBlob("image");
                        BufferedImage image1 = ImageIO.read(newSmile.getBinaryStream());
                        File outputFile = new File("saved.jpg");
                        ImageIO.write(image1, "jpg", outputFile);

                    }
                } catch (SQLException e){
                    e.printStackTrace();
                } finally {
                    if (resultSet != null){
                        resultSet.close();
                    } else {
                        System.err.println("DB read error");
                    }
                }
            } catch (SQLException | IOException ex){
                ex.printStackTrace();
            } finally {
                preparedStatement.close();
            }

        }
    }
}
