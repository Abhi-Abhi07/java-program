package access;

public class A{
    int pi;
    int num; 
    int[] arr;
    String name;
    
    public int get(){
        return num;
    }

    public void set(int n){
        this.num=n;
    }
    public A(String name, int num){
        this.num=num;
        this.name=name;
        this.arr=new int[num];
    }
}