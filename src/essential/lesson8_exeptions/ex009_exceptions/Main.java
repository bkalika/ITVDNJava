package essential.lesson8_exeptions.ex009_exceptions;

class ClassWithException{
    public void throwInner() throws Exception{
        throw new Exception("This is an inner exception.");
    }

    public void catchInner() throws Exception{
        try{
            this.throwInner();
        } catch (Exception e){
            throw new Exception("This is an inner exception.", e);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ClassWithException instance = new ClassWithException();

        try{
            instance.catchInner();
        } catch (Exception exception){
            System.out.println("Exception caught: " + exception.getMessage());
            System.out.println("Cause Exception: " + exception.getCause());
        }
    }
}
