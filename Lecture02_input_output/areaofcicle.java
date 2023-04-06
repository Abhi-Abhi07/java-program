import java.util.Scanner;

public class areaofcicle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of circle : ");
        int radius = sc.nextInt();
        double pi = 3.14;
        double area = pi*radius*radius;
        System.out.print("Area : ");
        System.out.print(area);
    }   
}
