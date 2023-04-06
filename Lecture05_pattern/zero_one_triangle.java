
import java.util.*;
public class zero_one_triangle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n=sc.nextInt();
        int a=1;
        int b=0;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if((j+i)%2==0){
                    System.out.print(a);
                }
                else{
                    System.out.print(b);
                }
            }
            System.out.println("");
        }
    }
}
