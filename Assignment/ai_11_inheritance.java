import java.util.Scanner;
class Data{
    public float a;
    public float b;
    // Data(float a,float b){
    //     // this.a=a;
    //     // this.b=b;
    //     input(a, b);
    // }
    public void input(float a, float b){
        this.a=a;
        this.b=b;
        output();
    }
    public void output(){
        System.out.println("First number is : "+this.a);
        System.out.println("Second number is : "+this.b);
    }
}
class Maximum extends Data{
    public float maxi;
    // Maximum(float a, float b){
    //     super(a,b);
    //     if(a>b){
    //         this.maxi=a;
    //     }
    //     else if(a==b){
    //         System.out.println("Both are equal");
    //     }
    //     else{
    //         this.maxi=b;
    //     }
    // }
    // void displayMax(){
    //     System.out.println("Maximum number is : "+this.maxi);
    // }
    public void findMax(){
     if(a>b){
            this.maxi=a;
        }
        else if(a==b){
            System.out.println("Both are equal");
        }
        else{
            this.maxi=b;
        }
    }
            void displayMax(){
                findMax();
        System.out.println("Maximum number is : "+this.maxi);
    }
}
public class ai_11_inheritance{
    
    public static void main(String args[]){
        // Maximum m=new Maximum(3f, 3f);
        // System.out.println(m.maxi);
        // m.displayMax();
        Maximum m=new Maximum();
        m.input(34, 35);
        m.displayMax();
    }

}