
import java.util.*;
public class InvertedHalfPyramidwithnumber_07 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n=sc.nextInt();
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print(j+1);
            }
            System.out.println("");
        }
    }
}
