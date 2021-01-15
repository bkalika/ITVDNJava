package professional_renewed.lesson13_multithreading.ex002_synchronization.withSynchronization;


public class Cashier extends Thread {
    int id;
    Ticket[] t;

    Cashier(int id, Ticket[] t){
        this.id = id;
        this.t = t;
    }

    public synchronized void run(){
        for(int i = 0; i < t.length; i++){
            t[i].buy(this);
        }
    }
}

