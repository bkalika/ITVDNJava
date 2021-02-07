package ex001_jpa_crud;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ClientRepository cr = new ClientRepository();

//        Client c1 = new Client();
//
//        c1.setName("Add");
//        c1.setAge(222);
//        c1.setPhone("111");
//
//        cr.add(c1);
//
////        ClientRepository cr2 = new ClientRepository();
//
//        List<Client> clients = cr.getAll();
//
//        for(Client client : clients){
//            System.out.println(client.getId() + " " + client.getName() + " "
//                    + client.getAge() + " " + client.getPhone());
//        }
//
//        System.out.println("GET By ID:");

        Client clientGet = cr.getById(15);
//        System.out.println(clientGet.getId() + " " + clientGet.getName() + " "
//                + clientGet.getAge() + " " + clientGet.getPhone());
//
//        System.out.println("DELETE:");
//
//        cr.remove(clientGet);

        clientGet.setPhone("4444");
        cr.add(clientGet);

    }

}
