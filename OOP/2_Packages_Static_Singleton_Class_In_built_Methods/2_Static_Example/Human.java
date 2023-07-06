package Static_ex;

public class Human {
    public
    String name;
    int age;
    int salary;
    boolean married;

    //1
    // public long population;

    //2
    public static long population;

    public Human(String name,int age,int salary, boolean married){
        this.age=age;
        this.salary=salary;
        this.name=name;
        this.married=married;

        // 1
        // this.population+=1;

        //2
        Human.population+=1;
        // this.population+=1;//working but don't use 
    }
}
