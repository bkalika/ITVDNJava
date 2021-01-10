package essential.lesson8_exeptions.ex005_exceptions;

class UserException extends Exception{
    public void method(){
        System.out.println("My exception");
    }
}

public class Main {
    public static void main(String[] args) {
        try{
            throw new UserException();
        } catch (UserException e){
            System.out.println("Exception handling");
            e.method();
        }
    }
}
