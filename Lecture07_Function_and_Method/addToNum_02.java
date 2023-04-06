import java.util.*;

public class addToNum_02{
    public static int addToNum(int a, int b){
        return a+b;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();
        int sum = addToNum(a,b);
        System.out.println("Sum is : "+sum);

    }

}