import java.util.*;

public class printMyName_01{

    public static void printMyName(String name){
        System.out.println(name);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name : ");
        String name = sc.next();
        printMyName(name);
    }
}