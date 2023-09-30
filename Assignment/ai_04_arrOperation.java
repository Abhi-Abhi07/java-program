import java.util.Scanner;
import java.util.Arrays;
public class ai_04_arrOperation{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter arr length : ");
        int n=sc.nextInt();
        System.out.println("Enter array elements : ");
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int a;
        do{
            System.out.println();
            System.out.println("1: Display");
            System.out.println("2: Searching");
            System.out.println("3: Sorting");
            System.out.println("4: Reverse");
            System.out.println("5: Maximum");
            System.out.println("6: Exit");
            System.out.println("Enter your choice : ");
            a=sc.nextInt();
            switch (a) {
                case 1:
                Display(arr);
                break;
                
                case 2:
                Display(arr);
                System.out.println("Enter element you want to search : ");
                int element=sc.nextInt();
                Searching(arr,element);
                break;

                case 3:
                System.out.println("Before Sorting");
                Display(arr);
                Sorting(arr);
                System.out.println("After sorting: ");
                Display(arr);
                break;

                case 4:
                Display(arr);
                Reverse(arr);
                break;

                case 5:
                Display(arr);
                Maximum(arr);
                break;

                case 6:
                break;

                default:
                System.out.println("Invalid input");
            }
        }while(a!=6);
    }
    public static void Display(int arr[]) {
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void Sorting(int arr[]) {
        Arrays.sort(arr);
    }

    public static void Searching(int arr[], int key) {
        for(int i=0; i<arr.length; i++){
            if(arr[i]==key){
                System.out.println("key found");
                return;
            }
        }
        System.out.println("key not found");
    }
    public static void Reverse(int arr[]) {
        for(int i=arr.length; i>0; i--){
            System.out.print(arr[i-1]+" ");
        }
        System.out.println();
    }
    public static void Maximum(int arr[]) {
        int max=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("maximum is : "+max);
    }
}