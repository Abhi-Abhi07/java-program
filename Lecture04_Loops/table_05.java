import java.util.*;
public class table_05 {
    public static void main(String args[]) {
        System.out.print("Enter number you want to Table : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<11; i++){
            System.out.println(n+" * "+(i)+" = "+(n*i));
        }
        
    }
}
