// Summary:
// Class: A blueprint that defines attributes and behaviors. It is used to create objects.
// Object: An instance of a class. It holds actual data and can use the behaviors defined by its class.
// 
//In the real world, you can think of a class as a blueprint for a house, while an object is an actual house built 
//from that blueprint. You can build many houses (objects) from the same blueprint (class), but each house can have 
//different details (values for its attributes).

// Defining a class named Car
class Car {
    // Fields (attributes)
    String make;
    String model;
    int year;

    // Constructor (to initialize the fields)
    Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Method (behavior)
    void startEngine() {
        System.out.println("The engine is starting...");
    }
}
//In this example, Car is the class. It defines three attributes: make, model, and year. It also has a behavior, the startEngine() method.

public class Main {
    public static void main(String[] args) {
        // Creating an object of the Car class
        Car myCar = new Car("Toyota", "Corolla", 2020);//Java allocates memory for a new Car object
        /* Constructor Called: The Car constructor is invoked with three arguments:

"Toyota" → assigned to make
"Corolla" → assigned to model
2020 → assigned to year */
        // Accessing object's attributes
        System.out.println("Car make: " + myCar.make);  // Output: Toyota
        System.out.println("Car model: " + myCar.model);  // Output: Corolla
        System.out.println("Car year: " + myCar.year);  // Output: 2020

        // Calling object's method
        myCar.startEngine();  // Output: The engine is starting...
    }
}

//Here, myCar is an object of the Car class. It has the values "Toyota" for make, "Corolla" for model, and 2020 for year. The method startEngine() is called on this object, which prints a message.
    


/* 

Program starts executing from main() in the Main class.

new Car("Toyota", "Corolla", 2020) is called →

Java allocates memory for a new Car object in the heap.

The constructor Car(String, String, int) runs and sets:

this.make = "Toyota"

this.model = "Corolla"

this.year = 2020

The reference (memory address of that object) is stored in the stack variable myCar.

The program prints the object's fields:

"Car make: Toyota"

"Car model: Corolla"

"Car year: 2020"

myCar.startEngine() is called → executes the method inside Car class → prints:
👉 "The engine is starting..."

Program ends successfully.

 */

