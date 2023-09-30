class Person{
    String name;
    int age;
    Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String Elder(Person p){
        if(this.age>p.age){
            return this.name;
        }
        else{
            return p.name;
        }
    }
}
public class ai_07_elder_person_using_this_reference{
    public static void main(String[] args) {
        Person p1=new Person("Ram", 50);
        Person p2 =new Person("Abhi",20);

        // String var=p1.Elder(p2);
        // System.out.println("Elder is "+var);
        
        System.out.println("Elder is "+p1.Elder(p2));
    }
}