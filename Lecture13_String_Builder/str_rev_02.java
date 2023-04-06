import java.util.*;

public class str_rev_02{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("ironman");
        // for(int i=0; i<sb.length()/2; i++){
        //     int front=i;
        //     int back=sb.length()-1-i;
        //     char frontchar=sb.charAt(front);
        //     char backchar=sb.charAt(back);
        //     sb.setCharAt(front, backchar);
        //     sb.setCharAt(back, frontchar);
        // }
        // System.out.println(sb);


    
        int i=0;
        int n=sb.length();
        while(i<n/2){
            char frontchar=sb.charAt(i);
            char backchar=sb.charAt(sb.length()-1-i);
            sb.setCharAt(i, backchar);
        sb.setCharAt(sb.length()-1-i, frontchar);
        
        i++;
        }
        System.out.println(sb);
    }

}