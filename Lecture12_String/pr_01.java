import java.util.*;

public class pr_01{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String arr[]=new String[size];
        int toLen=0;
        for(int i=0; i<size; i++){
            arr[i]=sc.next();
            toLen+=arr[i].length();
        }
        System.out.println(toLen);
    }

}