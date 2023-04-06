import java.util.*;
public class GreaterOrLess_04 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();

        if(a==b){
            System.out.print("Equal\n");
        }
        else{
            if(a>b){
                System.out.print("A is greater then B\n");
            }
            else{
                System.out.print("A is less then B\n");
            }
        }

        // if(a==b){
        //     System.out.print("Equal\n");
        // }
        // else if(a>b){
        //     System.out.print("A is greater then B\n");
        // }
        // else{
        //     System.out.print("A is less then B\n");
        // }
    }
}
