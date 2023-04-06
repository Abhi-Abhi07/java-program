
import java.util.*;

public class problem_10{
    
    public static void fibbonachi(int n) {
        int a=0; 
        int b=1;
        int fib=0;
        if(n>=0){
            System.out.println(0);
        }
        if(n>=1){
            System.out.println(1);
        }
        for(int i=1; i<n-1; i++){
            
            fib=a+b;
            System.out.println(fib);
            a=b;
            b=fib;
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();
        fibbonachi(n);
    }

}