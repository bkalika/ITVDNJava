package professional_renewed.lesson13_multithreading.ex001_threads.threadInfo;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread myThread = Thread.currentThread();

        System.out.println("Name of Thread: " + myThread.getName());

        myThread.setName("MyThread");
        System.out.println("Thread name: " + myThread.getName());

        System.out.println("Priority: " + myThread.getPriority());
        myThread.setPriority(10);
        System.out.println("Priority: " + myThread.getPriority());

        System.out.println("Is Thread Alive?: " + myThread.isAlive());

        new OtherThread().start();

        for(int i = 0; i < 5000000; i++){
            Thread.sleep(2000);
            System.out.println("i = " + i);
        }
    }
}

class OtherThread extends Thread{
    public void run(){
        for(int j = 0; j < 4; j ++){
            try{
                Thread.sleep(2000);
                System.out.println("j = " + j);

            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
