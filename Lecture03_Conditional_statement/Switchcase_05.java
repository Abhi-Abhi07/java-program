import java.util.*;
public class Switchcase_05 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Select a number between 1 to 3 : ");
        int num = sc.nextInt();

switch (num){
    case 1:
    System.out.print("Hello\n");
    break;
    case 2:
    System.out.print("Namaste\n");
    break;
    case 3:
    System.out.print("Bonjour\n");
    break;
    default:
    System.out.print("Invalid Selection !\n");
}

        // if(num==1){
        //     System.out.print("Hello\n");
        // }
        // else if(num==2){
        //     System.out.print("Namaste\n");
        // }
        // else if(num==3){
        //     System.out.print("Bonjour\n");
        // }
        // else{
        //     System.out.print("Invalid Selection !\n");
        // }
    }
}
