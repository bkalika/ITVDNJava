package essential.lesson8_exeptions.ex013_exceptions;

class MyExceptionA extends Exception {
    public MyExceptionA(String message){
        super(message);
    }
}

class MyExceptionB extends MyExceptionA{
    public MyExceptionB(String message){
        super(message);
    }
}

public class Main{
    public static void main(String[] args) {
        try{
            throw new Exception("Exception");
//            throw new MyExceptionA("MyExceptionA");
//            throw new MyExceptionB("MyExceptionB");
        } catch (MyExceptionB e){
            System.out.println(e.getMessage());
        } catch (MyExceptionA e){
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println(e);
        }
    }
}

