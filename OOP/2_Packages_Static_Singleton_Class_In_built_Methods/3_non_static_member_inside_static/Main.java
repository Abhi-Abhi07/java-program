public class Main{
    
    public static void main(String args[]){

    }
    // this is not dependent on objects, because it static
    void static fun(){
        greeting();//you cant use this because it requres an instance 
        //but the function you are using it in does not depend on instance
    }

    //we know that something which is not static, belongs to an object
    void greeting(){
        system.out.println("Hello Ai");
    }

}