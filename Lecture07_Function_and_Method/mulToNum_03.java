import java.util.*;

public class mulToNum_03{
    public static int calculateProd(int a, int b){
        return a*b;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();
        int prod = calculateProd(a,b);
        System.out.println("porduct is : "+ prod);
    }

}