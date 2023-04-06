import java.util.*;

public class pr_03{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string : ");
        String str = sc.nextLine();
        String ans="";
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='e'){
                ans+='i';
            }
            else{
                ans+=str.charAt(i);
            }
        }
        System.out.println(ans);
    }
}