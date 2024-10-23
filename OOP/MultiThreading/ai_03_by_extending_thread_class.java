// both thread run simultaneously
// thread me output har bar difference aata hai
// class A extends Thread{
//     public void run(){
//         for(int i=0; i<5; i++){
//             System.out.println("Abhi");
//         }
//     }
// }
// public class ai_03_by_extending_thread_class {
//     public static void main(String[] args) {
//         A t=new A();
//         t.start();
//         for(int i=0; i<5; i++){
//             System.out.println("Abhishek");
//         }
//     }
// }



// // both thread run simultaneously
// // total time 5seconds
// class A extends Thread{
//     @Override
//     public void run(){
//         try {
//             for(int i=0; i<5; i++){
//             System.out.println("Abhi");
//             Thread.sleep(1000);
//         }
//         } catch (InterruptedException i) {
//             // TODO: handle exception
//         }
//     }
// }
// public class ai_03_by_extending_thread_class {
//     public static void main(String[] args) throws InterruptedException{
//         A t=new A();
//         t.start();
//         for(int i=0; i<5; i++){
//             System.out.println("Abhishek");
//             Thread.sleep(1000);
//         }
//     }
// }



// only single thread run 
// total time 10seconds
class A extends Thread{
    public void fun(){
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
public class ai_03_by_extending_thread_class {
    public static void main(String[] args) throws InterruptedException{
        A t=new A();
        t.fun();
        for(int i=0; i<5; i++){
            System.out.println("Abhishek");
            Thread.sleep(1000);
        }
    }
}
