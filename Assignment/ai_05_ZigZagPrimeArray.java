import java.util.*;

public class ai_05_ZigZagPrimeArray {   
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
    public static void main(String[] args) {
        int arr[][]=new int[10][10];
        for(int i=1; i<=100; i++){
            if(isPrime(i)){
                int row=(i-1)/10;
                int col=(i-1)%10;
                arr[row][col]=i;
            }
        }
        for(int i=0; i<10;i++){
            for(int j=0; j<10; j++){
                if(arr[i][j]!=0){
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}

