public abstract class parent {
    int age;

    final int VALUE;
    //constructor in abstract class
    parent(int age){
        this.age=age;
        this.VALUE=23486;
    }

    // static method in abstract class
    static void hello(){
        System.out.println("hello ji");
    }

    //normal method in abstract class
    void normal(){
        System.out.println("me normal method hu");
    }
    abstract void carrer();
    abstract void partner();
}