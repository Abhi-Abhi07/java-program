import java.util.*;

public class sort_06{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number how many time enter : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        boolean isAcces=true;
        for(int i=0; i<n-1; i++){
            if(arr[i]>arr[i+1]){
                isAcces=false;
            }
        }
        if(isAcces==true){
            System.out.println("Array is sorting");
        }
        else{
            System.out.println("Array is not sorting");
        }
    }

}