import java.util.*;

public class calculater_06 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a=sc.nextInt();
        System.out.print("Enter second number : ");
        int b=sc.nextInt();
        System.out.print("Enter witch operation you will perform : ");
        
        // Character input in java
        char ch = sc.next().charAt(0); 

        
        switch (ch) {
            case '+':
            System.out.print(a+b);
            break;
            case '-':
            System.out.print(a-b);
            break;
            case '*':
            System.out.print(a*b);
            break;
            case '/': if(b==0){
                System.out.print("invalid selection !\n");
                break;
            }
            else{
                System.out.print(a/b);
                break;
            }
            case '%': if(b==0){
                System.out.print("invalid selection !\n");
                break;
            }
            else{
                System.out.print(a%b);
                break;
            }
            
            default:
            System.out.print("Invalid operation !");
                break;
        }
    }    
}
