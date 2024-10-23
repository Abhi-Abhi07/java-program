interface Printable {
    void print();
}
class Vehicle {
    public void drive() {
        System.out.println("Vehicle is driving.");
    }
}
class Car extends Vehicle {
    public void accelerate() {
        System.out.println("Car is accelerating.");
    }
}
class SportsCar extends Car implements Printable {
    public void race() {
        System.out.println("car is racing ");
    }

    public void print() {
        System.out.println("car is printable");
    }
}
public class HybridInheritanceExample {
    public static void main(String[] args) {
        SportsCar sportsCar = new SportsCar();
        sportsCar.drive(); // Inherited from Vehicle class
        sportsCar.accelerate(); // Inherited from Car class
        sportsCar.race(); // Defined in SportsCar class
        sportsCar.print(); // Implemented from Printable interface
    }
}