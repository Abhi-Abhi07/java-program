class A extends Thread{
    public void run(){

        String s=Thread.currentThread().getName();
        for(int i=0; i<3; i++){
            System.out.println(s);
        }
   }
}
public class ai_09_join_method {
    public static void main(String[] args) throws InterruptedException {
        Thread t1=new A();
        Thread t2=new A();
        Thread t3=new A();

        t1.setName("Abhi");
        t2.setName("Ram");
        t3.setName("Ai");
        
        t1.start();
        t3.start();
        for(int i=0; i<3; i++){
            System.out.println("main");
        }

        t2.start();
        // try {
            t2.join();
        // } catch (InterruptedException i) {
        //     // TODO: handle exception
        // }
    }
}
