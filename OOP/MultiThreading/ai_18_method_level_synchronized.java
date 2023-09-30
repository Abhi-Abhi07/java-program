 class Table{
    // public void printTable(int n){
    public synchronized void printTable(int n){
        for(int i=1; i<=10;i++){
            System.out.println(i*n);
        }
    }
}
class thread1 extends Thread{
    Table t;
    thread1(Table t){
        this.t=t;
    }
    public void run(){
        t.printTable(5);
    }
}

class thread2 extends Thread{
    Table t;
    thread2(Table t){
        this.t=t;
    }
    public void run(){
        t.printTable(7);
    }
}
public class ai_18_method_level_synchronized {
    public static void main(String[] args) {
        // har object ke pass ek lock hota hai
        Table obj=new Table(); //obj = 1 lock
        thread1 t1=new thread1(obj);
        thread2 t2=new thread2(obj);
        t1.start();
        t2.start();
    }
}
