package essential.lesson8_exeptions.ex006_exceptions;

import java.io.FileInputStream;

class UserException extends Exception{
    public void method(){
        System.out.println("My exception.");
    }
}

public class Main {
    public static void main(String[] args){
        try{
            throw new UserException();
        }catch (UserException userException){
            System.out.println("Exception handling");
            userException.method();

            try{
                FileInputStream fs = new FileInputStream("C:\\NonExistentFile.log");
            } catch (Exception exception){
                System.out.println(exception.getMessage());
            }
        }
    }
}
