import java.util.*;

public class searching_element_02{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int m=3; 
        int n=3;
        
        // int[][] arr=new int[m][n];
        // System.out.println("Enter values : ");
        // for(int i=0; i<m; i++){
        //     for(int j=0; j<n; j++){
        //         arr[i][j]=sc.nextInt();
        //     }
        // }

        int arr[][]={{2,3,4},{5,6,7},{8,9,90}};

        System.out.println();
        System.out.println("Enter element you want to search : ");
        int element=sc.nextInt();
        boolean ok=false;
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(arr[i][j]==element){
                    ok=true;
                   } 
            }
        }
        if(ok){
            System.out.println("Element exist");
           }
           else{
            System.out.println("Element don't exist");
           }
    }
}