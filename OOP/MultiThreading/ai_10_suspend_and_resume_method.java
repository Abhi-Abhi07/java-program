class A extends Thread{
    public void run(){
        try{
            String s=Thread.currentThread().getName();
            for(int i=0; i<3; i++){
                System.out.println(s);
                sleep(1000);
            }
        }
        catch(InterruptedException i){

        }
   }
}
public class ai_10_suspend_and_resume_method {
    public static void main(String[] args)  {
        Thread t1=new A();
        Thread t2=new A();
        Thread t3=new A();

        t1.setName("Abhi");
        t2.setName("Ram");
        t3.setName("Ai");
        // suspend and resume methed java se remove ho gje he
        // so end
        t1.start();
        t2.start();
        t2.suspend();
        t3.start();
        // for(int i=0; i<3; i++){
        //     System.out.println("main");
        // }
        t2.resume();

    }
}
