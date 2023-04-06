import java.util.*;

public class substr_06{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String sentance = "Abhi is Ai";

        // substring(begining index, ending index)
        // begining index are compulsary

        String name = sentance.substring(8,sentance.length());   
        System.out.println(name);
        System.out.println(sentance.substring(0));
        System.out.println(sentance.substring(2,6));
    }

}