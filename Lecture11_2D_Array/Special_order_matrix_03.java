import java.util.*;

public class Special_order_matrix_03{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=3;
        int m=3;
        int arr[][]=new int[n][m];
        System.out.println("Enter values : ");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Special matrix are : ");

        int rowst=0;
        int rowend=n-1;
        int colst=0;
        int colend=m-1;

        while(rowst<=rowend && colst<=colend){
            for(int col=colst; col<=colend; col++){
                System.out.print(arr[rowst][col]+" ");
            }
            rowst++;
            for(int row=rowst; row<=rowend; row++){
                System.out.print(arr[row][colend]+" ");
            }
            colend--;
            for(int col=colend; col>=colst; col--){
                System.out.print(arr[rowend][col]+" ");
            }
            rowend--;
            for(int row=rowend; row>=rowst; row--){
                System.out.print(arr[row][colst]+" ");
            }
            colst++;
            System.out.println();
        }
    }
}


// import java.util.*;


// public class Special_order_matrix_03 {
//    public static void main(String args[]) {
//       Scanner sc = new Scanner(System.in);
//       int n = sc.nextInt();
//       int m = sc.nextInt();

//       System.out.println("Enter values : ");
//       int matrix[][] = new int[n][m];
//       for(int i=0; i<n; i++) {
//            for(int j=0; j<m; j++) {
//                matrix[i][j] = sc.nextInt();
//            }
//       }


//       System.out.println("The Spiral Order Matrix is : ");
//       int rowStart = 0;
//       int rowEnd = n-1;
//       int colStart = 0;
//       int colEnd = m-1;


//       //To print spiral order matrix
//       while(rowStart <= rowEnd && colStart <= colEnd) {
//           //1
//           for(int col=colStart; col<=colEnd; col++) {
//               System.out.print(matrix[rowStart][col] + " ");
//           }
//           rowStart++;


//           //2
//           for(int row=rowStart; row<=rowEnd; row++) {
//               System.out.print(matrix[row][colEnd] +" ");
//           }
//           colEnd--;


//           //3
//           for(int col=colEnd; col>=colStart; col--) {
//               System.out.print(matrix[rowEnd][col] + " ");
//           }
//           rowEnd--;


//           //4
//           for(int row=rowEnd; row>=rowStart; row--) {
//               System.out.print(matrix[row][colStart] + " ");
//           }
//           colStart++;


//           System.out.println();
//       }
//    }
// }
