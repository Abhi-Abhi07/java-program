class A extends Thread{
    public void run(){
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread 1");
                sleep(1000);
            }
        } catch (InterruptedException i) {
            // TODO: handle exception
            System.out.println("Thread 1 is Terminated");
        }
    }
}
public class ai_14_interrupt_method {
    public static void main(String[] args) {
        A t1=new A();
        t1.start();
        t1.interrupt();
    }
}
