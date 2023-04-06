import java.util.*;

public class ArrayTwoD_01{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int m=3; 
        int n=5;
        int[][] arr=new int[m][n];
        System.out.println("Enter values : ");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix are : ");
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
               System.out.print(arr[i][j]+" ");
            }
               System.out.println();
           }
    }
}

