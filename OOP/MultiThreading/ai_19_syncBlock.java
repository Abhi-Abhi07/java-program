class msg{
    void show(String name){
        for(int i=0; i<5; i++){
            System.out.print(name+" ");
        }
        System.out.println();
        synchronized(this){
            for (int i = 0; i < 3; i++) {
                System.out.println("How are U "+name);
            }
        }
    }
}
class ourThread extends Thread{
    msg m;
    String name;
    ourThread(msg m,String name){
        this.m=m;
        this.name=name;
    }
    public void run(){
        m.show(name);
    }
}
public class ai_19_syncBlock {
    public static void main(String[] args) {
        msg m=new msg();
        ourThread t1=new ourThread(m,"Ram");
        ourThread t2=new ourThread(m, "Sita");
        t1.start();
        t2.start();
    }
}
