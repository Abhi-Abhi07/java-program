import java.util.*;

public class get_01{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=12;
        int pos=2;
        int bitMask=1<<pos;
        if((bitMask & n)==0){
            System.out.println("bit is zero");
        }
        else{
            System.out.println("Bit is one");
        }
    }

}