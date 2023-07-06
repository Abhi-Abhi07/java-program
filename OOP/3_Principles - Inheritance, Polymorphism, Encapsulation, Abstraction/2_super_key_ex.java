// 1. Invoking a superclass constructor: 

public class ChildClass extends ParentClass {
    public ChildClass() {
        super(); // Invokes the default constructor of the ParentClass
        // Additional code for ChildClass constructor
    }
}

// 2. Accessing superclass methods

public class ParentClass {
    public void printMessage() {
        System.out.println("Hello from ParentClass");
    }
}

public class ChildClass extends ParentClass {
    @Override
    public void printMessage() {
        super.printMessage(); // Calls the printMessage method of the superclass
        System.out.println("Hello from ChildClass");
    }
}


// 3. Accessing superclass variables

public class ParentClass {
    public int value = 10;
}

public class ChildClass extends ParentClass {
    public int value = 20;

    public void printValues() {
        System.out.println("Superclass value: " + super.value); // Accesses the value variable of the superclass
        System.out.println("Subclass value: " + this.value); // Accesses the value variable of the subclass
    }
}
