class A extends Thread{
    public void run(){
        try {
            String s=Thread.currentThread().getName();
            for(int i=0; i<3; i++){
                System.out.println(s);
                sleep(3000);
            }
        } catch (InterruptedException i) {
            // TODO: handle exception
        }
   }
}
public class ai_08_sleep_method {
    public static void main(String[] args) {
        Thread t1=new A();
        Thread t2=new A();
        Thread t3=new A();

        t1.setName("Abhi");
        t2.setName("Ram");
        t3.setName("Ai");
        
        t1.start();
        t2.start();
        t3.start();

    }
}
