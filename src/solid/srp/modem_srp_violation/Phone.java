package solid.srp.modem_srp_violation;

public class Phone implements IPhone {

    @Override
    public void dial(String phoneNumber){
        System.out.println("connected established");
    }

    @Override
    public void disconnect(){
        System.out.println("disconnect");
    }

    @Override
    public void send(String message){
        System.out.println("data sent succestully");
    }

    @Override
    public int receive(){
        return 0;
    }
}
