import java.util.*;

public class evenOrOdd_06{
    public static int isEven(int n) {
        int even=0;
            if(n%2==0){
                even = 1;
            }
        return even;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        int ans=isEven(n);
        if(ans==1){
            System.out.print("Even");
        }
        else{
            System.out.print("Odd");
        }
    }
}