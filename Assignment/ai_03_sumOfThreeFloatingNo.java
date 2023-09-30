import java.util.Scanner;
public class ai_03_sumOfThreeFloatingNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number : ");
        float a=sc.nextFloat();
        System.out.println("Enter second number : ");
        float b=sc.nextFloat();
        System.out.println("Enter third number : ");
        float c=sc.nextFloat();
        if(a>b && a>c){
            System.out.println("Maximum is a");
        }
        else if(b>a && b>c){
            System.out.println("maximum is b");
        }
        else{
            System.out.println("Maximum is c");
        }
    }
}
