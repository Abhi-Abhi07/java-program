public class ai_01_exception {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        // int b=5;
        System.out.println("main method started");
        try{
            int c=a/b;
            System.out.println(c);
        }
        catch(Exception e){ // ye super class hai
        // catch(ArithmeticException e){ // ye sub class hai
            System.out.println(e);
        }
        System.out.println("main method ended");
    }
}
