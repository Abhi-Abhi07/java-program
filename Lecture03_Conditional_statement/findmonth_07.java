import java.util.*;
public class findmonth_07 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any month in numeric : ");
        int num = sc.nextInt();

switch (num){
    case 1:
    System.out.print("January\n");
    break;
    case 2:
    System.out.print("February\n");
    break;
    case 3:
    System.out.print("March\n");
    break;
    case 4:
    System.out.print("April\n");
    break;
    case 5:
    System.out.print("May\n");
    break;
    case 6:
    System.out.print("June\n");
    break;
    case 7:
    System.out.print("July\n");
    break;
    case 8:
    System.out.print("Agust\n");
    break;
    case 9:
    System.out.print("September\n");
    break;
    case 10:
    System.out.print("October\n");
    break;
    case 11:
    System.out.print("November\n");
    break;
    case 12:
    System.out.print("December\n");
    break;
    default:
    System.out.print("Invalid Selection !\n");
}
}
}
