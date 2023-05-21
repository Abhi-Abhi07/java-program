import java.util.*;

public class set_02{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=5;
        int pos=1;
        int bitmask=1<<pos;
        int newNumber=bitmask | n;
        System.out.println(newNumber);
    }

}