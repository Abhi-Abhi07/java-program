
import java.util.*;

public class ai_06_final_keyword{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // final int bonus=100;
        // // bonus=200; // you can't modified 

        final A Abhi=new A("Abhi");
        System.out.println(Abhi.name);

        //Allowed
        Abhi.name="Ai";
        System.out.println(Abhi.name);

        //Not Allowed
        //when a non primitive is final, you can not reasign it.
        // Abhi=new A("Ab");
    }

}

class A{
    final int student=10;
    String name;
    public A(String name){
        this.name=name;
    }
}