// show error
// solution is next program
import java.util.*;

public class ai_02_creating_constructor{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        student Abhi=new student();
        System.out.println(Abhi.rollno);
        System.out.println(Abhi.name);
        System.out.println(Abhi.marks);
    }

}

class student{
    int rno;
    String name;
    float marks;


    //Creating constructor
    //we need a way to add the values of the above properties object by object
    //we need one word to access every object
    student(){
        Abhi.rollno=01;
        Abhi.name="Ai";
        Abhi.marks=91.34f;
    }
}