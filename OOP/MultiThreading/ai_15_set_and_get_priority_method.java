class A extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
    }
}
public class ai_15_set_and_get_priority_method {
    public static void main(String[] args) {
        A t1=new A();
        A t2=new A();
        A t3=new A();

        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");
        // by default priority 5 hoti hai
        t1.start();
        t2.start();
        t3.start();
        t1.setPriority(10);
    }
}
