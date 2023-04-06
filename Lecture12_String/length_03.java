import java.util.*;

public class length_03{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = "Abhi";
        int len = s.length();
        String s2 = "Bhai";
        String cct = s + " " + s2;
        System.out.println("String length is : "+len);
        int lencct  = cct.length();
        System.out.println("cct len is : "+lencct);
    }

}