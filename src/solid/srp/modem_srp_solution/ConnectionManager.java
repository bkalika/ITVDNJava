package solid.srp.modem_srp_solution;

public class ConnectionManager implements IConnectionManager {

    @Override
    public void dial(String phoneNumber){
        System.out.println("dial");
    }

    @Override
    public void disconnect(){
        System.out.println("disconnect");
    }
}
