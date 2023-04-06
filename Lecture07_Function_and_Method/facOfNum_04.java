import java.util.*;

public class facOfNum_04{
    
    public static void factorial(int n) {
        if(n<0){
            System.out.println("Invalid");
            return;
        }
        int fac=1;
        for(int i=n; i>=1; i--){
            fac=fac*i;
        }
        System.out.print("Factoral is : "+ fac);
        return;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        factorial(n);
    }

}