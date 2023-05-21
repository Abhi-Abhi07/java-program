import java.util.*;

public class clear_03{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=15;
        // kisi bhi position ko zero kar sakte hai
        int pos=2;
        int bitMask=1<<pos;
        int notBM=~(bitMask);
        System.out.println(notBM);
        int newnumber=notBM&n;
        System.out.println("After clear "+pos+" position : "+newnumber);
    }

}