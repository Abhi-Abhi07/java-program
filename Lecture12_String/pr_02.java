import java.util.*;

public class pr_02{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter email : ");
        String email = sc.next();
        for(int i=0; i<email.length(); i++){
            if(email.charAt(i)=='@'){
                break;
            }
            else{
                System.out.print(email.charAt(i));
            }
        }
    }
}