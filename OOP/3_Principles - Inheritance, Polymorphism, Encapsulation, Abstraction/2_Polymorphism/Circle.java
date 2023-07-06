package a;

public class Circle extends Shape{

    // this will run when obj of Circle is created
    // hence it is overriding the parent method
    @Override //this is called annotation
        public void area(){
        System.out.println("Area of Circle is pi*r*r");
    } 
}
