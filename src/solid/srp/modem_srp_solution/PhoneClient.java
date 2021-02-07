package solid.srp.modem_srp_solution;

public class PhoneClient {
    public static void main(String[] args) {
        Phone phone = new Phone(new ConnectionManager(), new DataManager());

        phone.dial("102");
        phone.send("my message");
        phone.receive();
        phone.disconnect();

    }
}
