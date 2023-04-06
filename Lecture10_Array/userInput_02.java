import java.util.*;

public class userInput_02{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size : ");
        int size=sc.nextInt();
        int numbers[]= new int[size];

        for(int i=0; i<size; i++){
            numbers[i]=sc.nextInt();
        }

        System.out.println("Numbers are : ");
        
        for(int i=0; i<size; i++){
            System.out.println(numbers[i]);
        }
    }

}