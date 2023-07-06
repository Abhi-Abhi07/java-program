public class subClass extends superClass{
    public subClass(){

    }
    public subClass(int a,int b){
        super(a,b);
    }
    public static void main(String[] args) {
        subClass obj=new subClass();
        System.out.println(obj instanceof superClass);
        System.out.println(obj instanceof Object);
        System.out.println(obj instanceof subClass);
        // System.out.println(obj instanceof instances_operator);

        System.out.println();
        System.out.println();
        
        superClass obj2=new superClass();
        System.out.println(obj2 instanceof superClass);
        System.out.println(obj2 instanceof Object);
        System.out.println(obj2 instanceof subClass);//its false because obj2 is superClass obj
        System.out.println(obj2 instanceof instances_operator);

        //getClass() store in heap memory
        // you can.t override because it final
        System.out.println(obj.getClass());//press (.) after getClass and try more feature 
        System.out.println(obj.getClass().getName());

    }
    
}
