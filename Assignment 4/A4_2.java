abstract class Vehicle {
    String make;
    String model;
    int year;
    String fuelType;

    public Vehicle(String make, String model, int year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }

    public abstract double calculateFuelEfficiency(); // returns miles per gallon (mpg)
    public abstract double calculateDistanceTraveled(double fuelConsumed); // returns distance in miles
    public abstract double getMaxSpeed(); // returns speed in miles per hour (mph)

    @Override
    public String toString() {
        return "Make: " + make + ", Model: " + model + ", Year: " + year + ", Fuel Type: " + fuelType;
    }
}

class Truck extends Vehicle {
    public Truck(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    @Override
    public double calculateFuelEfficiency() {
        return 15.0; // example value
    }

    @Override
    public double calculateDistanceTraveled(double fuelConsumed) {
        return fuelConsumed * calculateFuelEfficiency();
    }

    @Override
    public double getMaxSpeed() {
        return 120.0; // example value
    }
}

class Car extends Vehicle {
    public Car(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    @Override
    public double calculateFuelEfficiency() {
        return 25.0; // example value
    }

    @Override
    public double calculateDistanceTraveled(double fuelConsumed) {
        return fuelConsumed * calculateFuelEfficiency();
    }

    @Override
    public double getMaxSpeed() {
        return 150.0; // example value
    }
}

class Motorcycle extends Vehicle {
    public Motorcycle(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    @Override
    public double calculateFuelEfficiency() {
        return 50.0; // example value
    }

    @Override
    public double calculateDistanceTraveled(double fuelConsumed) {
        return fuelConsumed * calculateFuelEfficiency();
    }

    @Override
    public double getMaxSpeed() {
        return 180.0; // example value
    }
}
public class A4_2 {
    public static void main(String[] args) {
        Vehicle truck = new Truck("Ford", "F-150", 2022, "Diesel");
        Vehicle car = new Car("Toyota", "Camry", 2022, "Gasoline");
        Vehicle motorcycle = new Motorcycle("Yamaha", "YZF-R3", 2022, "Gasoline");

        System.out.println(truck);
        System.out.println("Fuel Efficiency: " + truck.calculateFuelEfficiency() + " mpg");
        System.out.println("Distance Traveled for 10 gallons: " + truck.calculateDistanceTraveled(10) + " miles");
        System.out.println("Max Speed: " + truck.getMaxSpeed() + " mph\n");

        System.out.println(car);
        System.out.println("Fuel Efficiency: " + car.calculateFuelEfficiency() + " mpg");
        System.out.println("Distance Traveled for 10 gallons: " + car.calculateDistanceTraveled(10) + " miles");
        System.out.println("Max Speed: " + car.getMaxSpeed() + " mph\n");

        System.out.println(motorcycle);
        System.out.println("Fuel Efficiency: " + motorcycle.calculateFuelEfficiency() + " mpg");
        System.out.println("Distance Traveled for 10 gallons: " + motorcycle.calculateDistanceTraveled(10) + " miles");
        System.out.println("Max Speed: " + motorcycle.getMaxSpeed() + " mph\n");
    }
}
