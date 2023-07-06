package Static_ex;

public class Human {
    public
    String name;
    int age;
    int salary;
    boolean married;

    public static long population;

    static void message(){
        System.out.println("Hello world");
        // System.out.println(this.age); //cant use this over here
    }

    public Human(String name,int age,int salary, boolean married){
        this.age=age;
        this.salary=salary;
        this.name=name;
        this.married=married;

        Human.population+=1;

        Human.message();
    }
}
