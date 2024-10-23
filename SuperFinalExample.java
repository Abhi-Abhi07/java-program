class Vehicle {
    public final String brand;
    public Vehicle(String brand) {
        this.brand = brand;
    }
    public final void start() {
        System.out.println("vehicle : "+this.brand);
        System.out.println("Starting the vehicle.");
    }
}
class Car extends Vehicle {
    private final String model;
    Car(String brand, String model) {
        super(brand); // Invoking superclass constructor
        this.model = model;
    }
    public void displayDetails() {
        System.out.println("Brand: " + super.brand); // Accessing superclass field using super
        System.out.println("Model: " + this.model);
    }
}
public class SuperFinalExample {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry");
        car.start(); // Invoking final method from superclass
        car.displayDetails(); // Displaying details using subclass method
    }
}
