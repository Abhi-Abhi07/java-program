import java.util.*;

public class ifelse_02 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        if(age>18){
            System.out.println("You are Adult");
        }
        else{
            System.out.println("You are Baby");
        }
    }
}
