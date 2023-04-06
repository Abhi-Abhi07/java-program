import java.util.*;

public class compare_05{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // compare  return 
        // s1>s2    +ve value
        // s1==s2   0
        // s1<s2    -ve value

        String s1 = "Abhi";
        String s2 = "Abhi";

        //use this
        if(s1.compareTo(s2)==0){ 
            System.out.println("String are equal");
        }
        else{
            System.out.println("String are not equal");
        }

        //don't use this
        // if(s1==s2){ 
        //     System.out.println("String are equal");
        // }
        // else{
        //     System.out.println("String are not equal");
        // }


        // don't use this
        // if(new String("Abhi")==new String("Abhi")){
        //     System.out.println("String are equal");
        // }
        // else{
        //     System.out.println("String are not equal");
        // }
    }

}