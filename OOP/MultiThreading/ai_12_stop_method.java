
class A extends Thread{
    public void run(){
        String s=Thread.currentThread().getName();
        for(int i=0; i<3; i++){
            System.out.println(s);
        }
   }
}
public class ai_12_stop_method {
    public static void main(String[] args)  {
        Thread t1=new A();
        Thread t2=new A();
        Thread t3=new A();

        t1.setName("Abhi");
        t2.setName("Ram");
        t3.setName("Ai");

        t1.start();
        t2.start();
        t3.start();
        t2.stop();
    }
}

