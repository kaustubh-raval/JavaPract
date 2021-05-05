 class Person1 {
    private boolean flag = false;

    public void releaseSignal(Person2 person2) {
        while (!person2.isSignalSent()) {
            System.out.println("Person1 is waiting for person2 to give signal");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Person1 gave signal");
        this.flag = true;
    }

    public boolean isSignalReleased() {
        return this.flag;
    }
}

class Person2 {
    private boolean flag = false;

    public void releaseSignal(Person1 person1) {

        while (!person1.isSignalReleased()) {

            System.out.println("person2 is waiting for person1 to give signal");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("person2 gave signal");

        this.flag = true;
    }

    public boolean isSignalSent() {
        return this.flag;
    }

}

public class LiveLock2 {

    static final Person1 person1 = new Person1();
    static final Person2 person2 = new Person2();

    public static void main(String[] args) {


        Thread t1 = new Thread(new Runnable() {
            public void run() {
                person2.releaseSignal(person1);
            }
        });
        t1.start();

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                person1.releaseSignal(person2);
            }
        });
        t2.start();
    }

}
