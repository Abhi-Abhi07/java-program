import java.util.*;

public class minMax_05{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[]={17,5,23,9,42,4,4,543,24,-9};
        int n=10;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            if(min>arr[i]){
                min=arr[i];
            }
            else if(max<arr[i]){
                max=arr[i];
            }
        } 
        System.out.println("Max : "+max);
        System.out.println("MIN : "+min);
    }

}