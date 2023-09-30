import java.util.*;

public class primeOrNot_05{
    
    public static boolean isPrime(int n) {
        if(n<2){
            return false;
        }
        boolean prime=true;
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                prime=false;
                break;
            }
        }
        return prime;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
    
        if(isPrime(n)){
            System.out.print("Prime");
        }
        else{
            System.out.print("Not a Prime");
        }
    }
}