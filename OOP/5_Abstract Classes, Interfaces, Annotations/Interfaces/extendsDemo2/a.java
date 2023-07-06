public interface a {
    //Static interface mthods should always have to body
    //call via the interface name
    static void greeting(){
        System.out.println("I am Static methods");
    }
    default void fun(){
        System.out.println("I am fun");
    }
}
