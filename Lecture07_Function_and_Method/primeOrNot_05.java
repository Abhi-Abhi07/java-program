import java.util.*;

public class primeOrNot_05{
    
    public static int isPrime(int n) {
        int prime=1;
        for(int i=0; i<=(n/2); i++){
            if(n%2==0){
                prime = 0;
                break;
            }
        }
        return prime;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        int ans=isPrime(n);
        if(ans==1){
            System.out.print("Prime");
        }
        else{
            System.out.print("Not a Prime");
        }
    }
}