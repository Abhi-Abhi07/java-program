// import java.util.*;
// public class HollowRecangle_02 {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number : ");
//         int n=sc.nextInt();
//         for(int i=0; i<n; i++){
//             System.out.print("*");
//         }
//         System.out.println("");
//         for(int k=0; k<(n-2); k++){
//             for(int i=0; i<2; i++){
//                 System.out.print("*");
//                 for(int j=0; j<(n-2); j++){
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println("");
//         }
//         for(int i=0; i<n; i++){
//             System.out.print("*");
//         }
//     }
// }

import java.util.*;
public class HollowRecangle_02 {
   public static void main(String args[]) {
       int n = 5;
       int m = 4;
       for(int i=0; i<n; i++) {
           for(int j=0; j<m; j++) {
               if(i == 0 || i == n-1 || j == 0 || j == m-1) {
                   System.out.print("*");
               } else {
                  System.out.print(" ");
               }
           }
           System.out.println();
       }
   }
}