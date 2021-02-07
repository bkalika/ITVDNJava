package solid.srp.modem_srp_violation;

public class PhoneClient {
    public static void main(String[] args) {
        IPhone phone = new Phone();

        phone.dial("102");
        phone.send("new message");
        phone.receive();
        phone.disconnect();
    }
}
