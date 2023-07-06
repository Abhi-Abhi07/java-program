import Static_ex.Human;


public class Main{
    
    public static void main(String args[]){
        Human Abhi = new Human("Ab",15, 100000,false);
        Human Raj = new Human("Raj",18, 200000,true);

        //1
        // System.out.println(Abhi.population);
        // System.out.println(Raj.population);
        
        //2
        System.out.println(Human.population);
        System.out.println(Human.population);
    }

}
