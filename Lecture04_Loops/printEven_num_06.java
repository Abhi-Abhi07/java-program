import java.util.*;
public class printEven_num_06 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();

        // for(int i=2; i<=n; i+=2){
        //     System.out.print(i+" ");
        // }

        for(int i=1; i<=n; i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
    }
}
