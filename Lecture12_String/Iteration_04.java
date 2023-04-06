import java.util.*;

public class Iteration_04{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = "Abhi";
        String s2 = "Bhai";
        String cct = s + " " + s2;
        for(int i=0; i<cct.length(); i++){
            System.out.println(cct.charAt(i));
        }
    }

}