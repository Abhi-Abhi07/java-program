import java.util.Scanner;
class InvalidAgeException extends Exception{
    InvalidAgeException(String msg){
        System.out.println(msg);
    }
}
public class ai_17_userDefinedException {
    public static void vote(int age) throws Exception {
        if(age<18){
            throw new InvalidAgeException("Not eligible for voting");
        }
        else{
            System.out.println("Eligible for voting");
        }
    }
    public static void main(String[] args) {
        System.out.println("main method start");
        System.out.print("Enter age : ");
        Scanner sc = new Scanner(System.in);
        int age=sc.nextInt();
        try {
            vote(age);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
        System.out.println("main method ended");
    }
}
