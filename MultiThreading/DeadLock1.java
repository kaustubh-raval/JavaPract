import java.lang.*;
import java.util.concurrent.locks.ReentrantLock;

public class DeadLock1
{
  public static void main(String[] args)
  {
    ReentrantLock Lock1 = new ReentrantLock();
    ReentrantLock Lock2 = new ReentrantLock();

    Thread t1 = new Thread(new Runnable() {

            @Override
            public void run()
            {
              synchronized (Lock1) {
              System.out.println("Thread 1 - lock 1");

              try {
                Thread.sleep(10);
              }
              catch (InterruptedException e) {
                e.printStackTrace();
              }
              System.out.println("Thread 1 is waiting for lock 2");

              synchronized (Lock2) {
              System.out.println("Thread 1 - lock 1 and 2");
            }
          }
        }
        });

        Thread t2 = new Thread(new Runnable() {
                @Override
                public void run()
                {
                  synchronized (Lock2) {
                  System.out.println("Thread 2 - lock 2");

                  try { Thread.sleep(10); }
                  catch (InterruptedException e) {}
                  System.out.println("Thread 2 is waiting for lock 1");

                  synchronized (Lock1) {
                  System.out.println("Thread 2 - lock 1 and 2");
                }
              }
            }
            });

            t1.start();
            t2.start();
  }
}
