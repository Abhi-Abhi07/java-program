
import java.util.*;
public class HollowButterfully_03 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n= sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=1; j++){
                System.out.print("*");
            }
            for(int j=3; j<=i; j++){
                System.out.print(" ");
            }
            if(i>=2){
                System.out.print("*");
            }
            for(int j=1; j<=(2*(n-i)); j++){
                System.out.print(" ");
            }
            if(i>=2){
                System.out.print("*");
            }  
            for(int j=3; j<=i; j++){
                System.out.print(" ");
            }  
            for(int j=1; j<=1; j++){
                System.out.print("*");
            }       
            System.out.println("");
        }
        for(int i=n; i>=1; i--){
            for(int j=1; j<=1; j++){
                System.out.print("*");
            }
            for(int j=3; j<=i; j++){
                System.out.print(" ");
            }
            if(i>=2){
                System.out.print("*");
            }
            for(int j=1; j<=(2*(n-i)); j++){
                System.out.print(" ");
            }
            if(i>=2){
                System.out.print("*");
            }  
            for(int j=3; j<=i; j++){
                System.out.print(" ");
            }  
            for(int j=1; j<=1; j++){
                System.out.print("*");
            }       
            System.out.println("");
        }
    }
}
