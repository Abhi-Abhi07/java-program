import java.util.*;
public class EvenOdd_03 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number you will check even or odd : ");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.print("Number is Even !\n");
        }
        else{
            System.out.print("Nmber is Odd !\n");
        }
    }
}
