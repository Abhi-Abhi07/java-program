public class ai_13_throws{
    public static void main(String[] args)throws InterruptedException {
        for(int i=1; i<=10; i++){
            System.out.println(i);
            Thread.sleep(1000);
        }
    }
}



// public class ai_13_throws{
//     public static void main(String[] args) {
//         for(int i=1; i<=10; i++){
//             try {
//                 System.out.println(i);
//                 Thread.sleep(1000);                
//             } catch (InterruptedException e) {
//                 // TODO: handle exception
//                 System.out.println(e);
//             }
//         }
//     }
// }