import java.util.*;

class myGeneric<T1,T2>{
    int val;
    private T1 t1;
    private T2 t2;

    public myGeneric(int val, T1 t1,T2 t2){
        this.val=val;
        this.t1=t1;
        this.t2=t2;
    }

    public int getval(){
        return val;
    }

    public void setval(int val){
        this.val=val;
    }

    public T1 getT1(){
        return t1;
    }

    public void setT1(T1 t1){
        this.t1=t1;
    }

    public T2 getT2(){
        return t2;
    }

    public void setT2(T2 t2){
        this.t2=t2;
    }

}
public class generic {
    public static void main(String[] args) {

        ArrayList arraylist=new ArrayList();
        // ArrayList<Integer> arraylist=new ArrayList();


        arraylist.add("sdfg");
        arraylist.add(34);
        arraylist.add(45);
        arraylist.add(new Scanner(System.in));

        // System.out.println(arraylist.get(2));

        int a=(int)arraylist.get(2);
        // int a=(int)arraylist.get(2);

        // System.out.println(a);

        myGeneric<String,Integer> g1 = new myGeneric(13, "Mystring is my string",45);
        String str = g1.getT1();
        int x = g1.getT2();
        System.out.println(str);
        System.out.println(x);
    }
}
