class A extends Thread {
    public void run() {

        String s = Thread.currentThread().getName();
        for (int i = 0; i < 3; i++) {
            System.out.println(s);
            Thread.yield();
        }
    }
}

class B extends Thread {
    public void run() {
        String s = Thread.currentThread().getName();
        for (int i = 0; i < 3; i++) {
            System.out.println(s);
        }

    }
}

class C extends Thread {
    public void run() {

        String s = Thread.currentThread().getName();
        for (int i = 0; i < 3; i++) {
            System.out.println(s);
        }

    }
}

public class ai_11_yield_method {
    public static void main(String[] args) {
        A t1 = new A();
        B t2 = new B();
        C t3 = new C();

        t1.setName("Thread-1");
        t2.setName("Thread-2");
        t3.setName("Thread-3");

        t1.start();
        t2.start();
    }
}
