import java.util.*;

public class nameInput_04{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number you want to enter name : ");
        int n=sc.nextInt();
        String[] name=new String[n];
        System.out.println("Enter names : ");
        for(int i=0; i<n; i++){
            name[i]=sc.next();
        }
        for(int i=0; i<n; i++){
            System.out.println("Name : "+name[i]);
        }
    }

}