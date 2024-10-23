interface Flyable {
    void fly();
}
interface Swimmable {
    void swim(int a);
}
class Bird implements Flyable {
    public void fly() {
        System.out.println("Bird is flying.");
    }
}
class Birds implements Flyable {
    public void fly() {
        System.out.println("Birds is flying.");
    }
}
class Fish implements Swimmable {
    public void swim(int a) {
        System.out.println("Fish is swimming.");
        System.out.println("A is : "+a);
    }
}
public class MultipleInheritanceExample {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.fly(); // Implemented from Flyable interface
        Birds birds = new Birds();
        birds.fly();
        Fish fish = new Fish();
        fish.swim(4); // Implemented from Swimmable interface
    }
}