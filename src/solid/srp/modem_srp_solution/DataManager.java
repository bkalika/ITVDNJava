package solid.srp.modem_srp_solution;

public class DataManager implements IDataManager {
    @Override
    public void send(String message){
        System.out.println("send");
    }

    @Override
    public int receive(){
        return 0;
    }
}
