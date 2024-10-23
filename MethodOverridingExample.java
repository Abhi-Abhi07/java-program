// Example illustrating method overriding: 
class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks.");
    }
}
public class MethodOverridingExample {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound(); // Output: Animal makes a sound.
        Dog dog = new Dog();
        dog.makeSound(); // Output: Dog barks.
        Animal animalDog = new Dog(); // Upcasting
        animalDog.makeSound(); // Output: Dog barks. (Dynamic Method Dispatch)
    }
}