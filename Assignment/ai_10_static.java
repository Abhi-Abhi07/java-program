class Number{
    int number;
    private static int count;
    Number(int number){
        this.number=number;
        // count++; //its work
        // this.count++; //its work
        Number.count++;//best way to access the static variable count (why ?)
        // because static varible ko static way se hi access kar sakte hai
        // or static variacle ko direct class ke name se access kar sakte hai
        // static ko access karne ke liye object create karne ki need nhi hai
    }
    public void display(int count){
        System.out.println("static variable : "+Number.count); 
        System.out.println("parameter pass non static variable : "+count);
    }
}
public class ai_10_static {
    static int a=10;
    int b=20;
    public static void main(String[] args) {
        Number n1=new Number(2);
        Number n2=new Number(5);
        Number n3=new Number(7);
        n1.display(5);
        // static int a; //show error
        // because static variable kisi method ke under declare nhi kar sakte 
        // only access kar sakte ho

        // Show();//show error because non static method ko access karne ke liye 
        // we need object of the class
        show();
        ai_10_static.show();
        ai_10_static obj=new ai_10_static();
        // obj.show(); //its work but static method access only static way
        obj.Dis();

    }
    static void show(){
        // System.out.println(a+"   "+b);//show error 
        //because static method me only static variable ko hi access kar sakte hai
        System.out.println("static method : "+a);
    }
    void Dis(){
        System.out.println("Non static method : "+a+"   "+b);
        // static or non static both are access in non static method 
    }
}
