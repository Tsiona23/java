// Superclasses and Subclasses
class Vehicle {
    String brand;
    int year;

    void start() {
        System.out.println("Vehicle starting...");
    }
}

class Car extends Vehicle {
    int doors;

    void honk() {
        System.out.println("Car honking!");
    }
}