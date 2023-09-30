public class ai_16_tryCatch_vs_throws {
    public static void Wait() throws Exception{
        for(int i=1; i<=10; i++){
            System.out.println(i);
            Thread.sleep(1000);
        }
    }
    public static void main(String[] args) {
        System.out.println("main method started");
        try {
            Wait();
            System.out.println(10/0);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Exception handled !");
        }
        System.out.println("main method ended");
    }
}


// public class ai_16_tryCatch_vs_throws {
//     public static void Wait() throws Exception{
//         for(int i=1; i<=10; i++){
//             System.out.println(i);
//             Thread.sleep(1000);
//         }
//     }
//     public static void main(String[] args) throws Exception {
//         System.out.println("main method started");
//         Wait();
//         System.out.println(10/0);
//         System.out.println("main method ended");
//     }
// }
