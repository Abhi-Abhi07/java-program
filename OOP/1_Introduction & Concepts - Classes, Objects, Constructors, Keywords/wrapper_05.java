import java.util.*;

public class wrapper_05{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int num1=10;
        Integer num2=20;//Integer is final class
        // num1 //uncomment karke "." lagaye then option dekhe
        // num2 //uncomment karke "." lagaye then option dekhe

        //value swap nhi hogi
        int a=10; 
        int b=20;

        //value swap nhi hogi
        // Integer a =10;
        // Integer b =20;

        swap(a,b);
        System.out.println(a+" "+b); 


        final int bonus=2300;
        // bonus=4500; // you cann't modified because final keyword
    }
    static void swap(Integer a,Integer b){
        Integer temp=a;
        a=b;
        b=temp;
    }

}
