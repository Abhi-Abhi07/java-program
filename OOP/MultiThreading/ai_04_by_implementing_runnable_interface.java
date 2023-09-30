class B implements Runnable{
    public void run(){
        try {
            for(int i=0; i<5; i++){
            System.out.println("Abhi");
            Thread.sleep(1000);
        }
        } catch (InterruptedException i) {
            // TODO: handle exception
        }
    } 
}
public class ai_04_by_implementing_runnable_interface {
    public static void main(String[] args) throws InterruptedException{
        B r=new B();
        Thread t=new Thread(r);
        t.run(); // only single thread run (time taken 10 seconds)
        // t.start(); // both thread are run simultaniusly (time taken 5 seconds)
        for(int i=0; i<5; i++){
            System.out.println("Abhishek");
            Thread.sleep(1000);
        }
    }
}
