import java.util.*;
public class pr_03 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n= sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            int val=i;
            for(int j=1; j<=i; j++){
                System.out.print(val);
                val--;
            }
            for(int j=1; j<i; j++){
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
}