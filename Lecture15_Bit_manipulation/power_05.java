import java.util.*;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class power_05{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n=sc.nextInt();
        int n2=n;
        int cnt=0;
        int bit=0;
        int i=1;
        int ans=0;
        while(n!=0){
            bit=n&1;
            ans=bit*i+ans;
            n=n>>1;
            i*=10;
        }
        System.out.println("integer ki range se bahar jane par ye fat jata hai");
        System.out.println(""+n2+" convert to binary : "+ans);
        while(ans!=0){
            int digit=ans%10;
            if(digit==1){
                cnt++;
            }
            ans=ans/10;
        }
        if(cnt==1){
            System.out.println(n2+" is represent power of 2");
        }
        else{
            System.out.println(n2+" is not represent power of 2");
        }
    }

}