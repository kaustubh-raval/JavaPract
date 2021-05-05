import java.util.concurrent.locks.ReentrantLock;

public class Counter3 implements Runnable {
    static int counter = 0;

    static ReentrantLock lock = new ReentrantLock(true);

    static void incrementCounter(){
        lock.lock();

        try{
            System.out.println(Thread.currentThread().getName() + ":" + counter);
            counter++;
        }finally{
             lock.unlock();
        }
     }

    @Override
    public void run() {
        while(counter<50){
            incrementCounter();
        }
    }

    public static void main(String[] args) {
        Counter3 te = new Counter3();
        Thread gate1 = new Thread(te);
        Thread gate2 = new Thread(te);
        Thread gate3 = new Thread(te);

        gate1.start();
        gate2.start();
        gate3.start();
    }
}
