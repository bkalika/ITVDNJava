package professional_renewed.lesson13_multithreading.ex002_synchronization.withSynchronization;

public class Ticket {
    boolean isBought;
    int place;

    Ticket(int place) {
        this.place = place;
    }

//    synchronized void buy(Cashier c){
//        if(!isBought){
//            try{
//                Thread.sleep(1000);
//            } catch (InterruptedException e){
//                System.out.println(e);
//            }
//            isBought = true;
//            System.out.println("Cashier " + c.id + " ticket " + this.place);
//        }
//    }

//    // or:
//    void buy(Cashier c) {
//        synchronized (this) {
//            if (!isBought) {
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    System.out.println(e);
//                }
//                isBought = true;
//                System.out.println("Cashier " + c.id + " ticket " + this.place);
//            }
//        }
//    }

    // or by class:
    void buy(Cashier c) {
        synchronized (Ticket.class) {
            if (!isBought) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
                isBought = true;
                System.out.println("Cashier " + c.id + " ticket " + this.place);
            }
        }
    }
}
