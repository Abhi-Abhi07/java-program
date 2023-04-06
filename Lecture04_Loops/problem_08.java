import java.util.*;
public class problem_08 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;
            do{
                System.out.print("Enter marks : ");
                int marks = sc.nextInt();
                if(marks>=90){
                    System.out.println("This is Good : ");
                }
                else if(marks<90 && marks>59){
                    System.out.println("This is Badiya : ");
                }
                else if(marks<60){
                    System.out.println("This is also good");
                }
                else{
                    System.out.println("ok : ");
                }
                System.out.print("Enter numbe 0 for 'NO' and 1 for 'YES' : ");
                n = sc.nextInt();
            }while(n==1);
    }
}
