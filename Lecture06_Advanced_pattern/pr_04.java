import java.util.*;
public class pr_04 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n=sc.nextInt();
        for(int i=1; i<n; i++){
            System.out.print(" ");
        }
        for(int i=0; i<n; i++){
            System.out.print("*");
        }
        System.out.println("");
        for(int k=0; k<(n-2); k++){
            for(int i=1; i<n-(k+1); i++){
                System.out.print(" ");
            }  
            for(int i=0; i<2; i++){
                System.out.print("*");
                for(int j=0; j<(n-2); j++){
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        for(int i=0; i<n; i++){
            System.out.print("*");
        }
    }
}

