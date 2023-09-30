import java.util.ArrayList;
import java.util.function.Consumer;
public class  lamdaFunction{
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0; i<5; i++){
            arr.add(i+1);
        }
        // arr.forEach((item)->System.out.println(item*2));

        Consumer<Integer>fun=(item)->System.out.println(item*2);

        operation sum=(a,b)->(a+b);
        operation sub=(a,b)->(a-b);
        operation mul=(a,b)->(a*b);

        lamdaFunction mycalculater=new lamdaFunction();
        System.out.println(mycalculater.operate(3,5,sum));
        System.out.println(mycalculater.operate(7,2,sub));
        System.out.println(mycalculater.operate(7,2,mul));

    }

    private int operate(int a, int b, operation op){
        return op.operation(a, b);
    }
    public interface operation {
        int operation(int a, int b);
    }
}