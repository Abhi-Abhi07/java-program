import java.util.*;

public class Strings_01{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //String are immutable

        // Decalaration
        String name = "iron";
        String fullname = "iron man";
        String sentance = "tony is iron man";
        System.out.println(name);
        System.out.println(fullname);
        System.out.println(sentance);

        //user input

        System.out.println("Enter name or sentance : ");

        // String any = sc.next();
        String any = sc.nextLine();
        System.out.println(any);
    }

}