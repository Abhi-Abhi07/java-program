import java.util.*;

public class problem_08{
    
    public static int power(int a, int b) {
        if(b==0){
            return 1;
        }
        if(b==1){
            return a;
        }
        int n=a;
        for(int i=1; i<b; i++){
            a=a*n;
        }
        return a;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number : ");
        int a = sc.nextInt();
        int b= sc.nextInt();
        System.out.println(a+"^"+b+" : "+power(a,b));
    }

}