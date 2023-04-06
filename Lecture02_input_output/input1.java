import java.util.*;

public class input1{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string : ");
        String nam = sc.next(); 
        System.out.println(nam);

        System.out.println("Again enter string : ");
        String name = sc.next(); 
        System.out.println(name);

        System.out.println("Again enter string : ");
        String nem = sc.nextLine(); 
        System.out.println(nem);


        // for float -> nextFloat()
        // for int -> nextInt()
        System.out.println("Enter any number : ");
        int a = sc.nextInt();
        System.out.println(a);
    }
}