import java.util.Scanner;

public class problem_07{
    
    public static void main(String []args){
        Scanner sc  = new Scanner(System.in);
        int n=0;
        int neg=0;
        int pos=0;
        int zeros=0;
        do{
            int num;
            System.out.println("Enter number : ");
            num = sc.nextInt();
            if(num>0){
                pos++;
            }
            else if(num<0){
                neg++;
            }
            else{
                zeros++;
            }
            System.out.println("Press 1 for continue and exit for 0 : ");
            n=sc.nextInt();
        }while(n==1);

        System.out.println("Positive : "+pos);
        System.out.println("Negative : "+neg);
        System.out.println("Zeros : "+zeros);

    }

}
