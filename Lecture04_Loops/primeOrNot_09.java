
import java.util.*;
public class primeOrNot_09  {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();

        boolean isPrime=true;

        for(int i=2; i<=(n/2); i++){
            if(n%i==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime){
            if(n==1){
                System.out.println("This is neither prime or not components");
            }
            else{
                    System.out.print("prime number");
                }
        }
        else{
            System.out.print("Not a prime number");
        }

        // int isPrime=0;
        // if(n==1){
        //     System.out.print("Not a prime number"); 
        // }
        // else if(n==2){
        //     System.out.print("prime number");
        // }
        // else{
        //     for(int i=2; i<n; i++){
        //         isPrime=n%i;
        //         if(isPrime==0){
        //             break;
        //         }
        //     }
        //     if(isPrime==0){
        //         System.out.print("Not a prime number");
        //     }
        //     else{
        //         System.out.print("prime number"); 
        //     }
        // }
    }       
}
