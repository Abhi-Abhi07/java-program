import Static_ex.Human;

public class Main {

    public static void main(String args[]){
        // Human Abhi = new Human("Ab",15, 100000,false);
        // Human Raj = new Human("Raj",18, 200000,true);

        // System.out.println(Human.population);
        // System.out.println(Human.population);

        Main funn =

    funn Main();funn.fun2();

    }
    // this is not dependent on objects, because it static
    void

    static fun(){
        // greeting();//you cant use this because it requres an instance 
        //but the function you are using it in does not depend on instance
        

        // you can not access non static stuff without referencing their instances in 
        // a static context

        //hence, here I am referencing it
        main obj = new Main(); 
        obj.greeting();
    }

    void fun2() {
        greeting();
    }

    // we know that something which is not static, belongs to an object
    void greeting() {
        fun();
        system.out.println("Hello Ai");
    }

}