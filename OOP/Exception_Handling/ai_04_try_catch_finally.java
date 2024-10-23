public class ai_04_try_catch_finally {
    public static void main(String[] args) {
        System.out.println("main method start");
        try {
            System.out.println("try start");
            int a=10;
            // int b=2;
            int b=0;
            int c=a/b;
            System.out.println(c);
            System.out.println("try end");
        } 
        // catch (ArithmeticException a) {
        catch (NullPointerException a) {
            // int d=10/0;
            System.out.println("can't divide by zerod");
        }
        finally{
            // int e=10/0;
            System.out.println("Radhe Radhe");
        }
        int f=10/0;
        System.out.println("main method end");
    }
}
