class A extends Thread{
//     public void run(){
//         String s=Thread.currentThread().getName();
//         for(int i=0; i<3; i++){
//             System.out.println(s);
//         }
//    }
}
public class ai_13_isAlive_method {
    public static void main(String[] args)  {
        Thread t1=new A();
        Thread t2=new A();

        t1.setName("Abhi");
        t2.setName("Ram");

        t1.start();
        System.out.println("Before starting t2 isAlive() : "+t2.isAlive());
        t2.start();
        System.out.println("After starting t2 isAlive() : "+t2.isAlive());
    }
}
