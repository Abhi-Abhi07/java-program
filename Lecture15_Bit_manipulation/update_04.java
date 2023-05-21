import java.util.*;

public class update_04{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n=sc.nextInt();
        System.out.println("Enter position jo ki number ki binary represantation <= ho : ");
        int pos=sc.nextInt();
        System.out.println("Enter number you want to change "+pos+" position is 0 or 1 :");
        int num=sc.nextInt();
        int bitmask=1<<pos;
        if(num==1){
            int newNumber=bitmask | n;
            System.out.println(newNumber);
        }
        else if(num==0){
            int notBM=~(bitmask);
            int newNumber=notBM & n;
            System.out.println(newNumber);
        }
    }

}
