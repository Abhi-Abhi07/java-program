class TS extends Thread {
    public void run() {
        String s = Thread.currentThread().getName();
        for (int i = 0; i < 5; i++) {
            System.out.println(s);
        }
    }

}

public class ai_05_thread_schedular {
    public static void main(String[] args) {
        TS t1 = new TS();
        TS t2 = new TS();
        TS t3 = new TS();

        t1.setName("thread1");
        t2.setName("thread2");
        t3.setName("thread3");

        t1.start();
        t2.start();
        t3.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("main thread");
        }
    }

}
