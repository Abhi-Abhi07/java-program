import java.util.*;
import java.util.Spliterators.AbstractIntSpliterator;

public class ai_01_oop{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // int[] rno = new int[5];
        // String[] name = new String[5];
        // float[] marks = new float[5];


        // student[] students=new student[5];
        // System.out.println(Arrays.toString(students));


        // just declearing
        student Abhi;
        Abhi = new student();
        // student Abhi = new student();

        // //Default values
        // System.out.println(Abhi);
        // System.out.println(Abhi.rollno);
        // System.out.println(Abhi.name);
        // System.out.println(Abhi.marks);


        // //set values
        // Abhi.rollno=01;
        // Abhi.name="Ai";
        // Abhi.marks=91.34f;
        // System.out.println(Abhi.rollno);
        // System.out.println(Abhi.name);
        // System.out.println(Abhi.marks);

        
        // Alredy value set
        // Abhi.rollno=01; // Ek baar uncomment karke run kre
        System.out.println(Abhi.rollno);
    }
}

class student{
    // // set value ka case
    // // Default value
    // int rollno;
    // String name;
    // float marks;

    // // value set
    int rollno=3;
}