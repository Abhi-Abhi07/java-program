import java.util.*;

public class searchNum_03{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int arr[]={54,543,356,53,5};

        System.out.println("Enter number you want to searsh : ");
        int num=sc.nextInt();

        for(int i=0; i<arr.length; i++){
            if(arr[i]==num){
                System.out.println("Number are "+i+" index");
            }
        }

    }

}