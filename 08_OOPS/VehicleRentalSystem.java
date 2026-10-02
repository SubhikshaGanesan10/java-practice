/*
 * Exercise: Vehicle Rental System
 *
 * Create a Vehicle class with private fields:
 * - vehicleId
 * - brand
 * - rentalPricePerDay
 * - calculateRentalCost(int days)
 * - displayDetails()
 *
 * Create Car and Bike classes that inherit from Vehicle.
 *
 * Car:
 * - Add numberOfSeats
 * - Override displayDetails()
 *
 * Bike:
 * - Add hasGear
 * - Override displayDetails()
 *
 * Requirements:
 * - Create 2 Cars and 2 Bikes
 * - Store all vehicles in a Vehicle array
 * - Use a loop to display their details
 * - Calculate the rental cost for a given number of days
 */
class Vehicle{
    private int vehicleId;
    private String brand;
    private double rentalPricePerDay;

    public int getVehicleId(){
        return vehicleId;
    }

    public String getBrand(){
        return brand;
    }

    public Vehicle(int vehicleId, String brand, double rentalPricePerDay){
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.rentalPricePerDay = rentalPricePerDay;
    }

    public double calculateRentalCost(int days){
        return days*rentalPricePerDay;
    }
    public void displayDetails(){
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Vehicle Brand: " + brand);
    }
}

class Bike extends Vehicle{
    boolean hasGear;
    public Bike(int vehicleId, String brand, double rentalPricePerDay, boolean hasGear){
        super(vehicleId, brand, rentalPricePerDay);
        this.hasGear = hasGear;
    }

    @Override
    public void displayDetails(){
        System.out.println("Bike ID: " + getVehicleId());
        System.out.println("Bike Brand: " + getBrand());
        System.out.println(hasGear ? "Bike has Gear" : "Bike does not have Gear");
    }
}

class Car extends Vehicle{
    int numberOfSeats;
    public Car(int vehicleId, String brand, double rentalPricePerDay, int numberOfSeats){
        super(vehicleId, brand, rentalPricePerDay);
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public void displayDetails(){
        System.out.println("Car ID: " + getVehicleId());
        System.out.println("Car Brand: " + getBrand());
        System.out.println("Number Seats: " + numberOfSeats);
    }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {

        Vehicle[] vehicle = new Vehicle[4];
        vehicle[0] = new Car(0,"Ford", 50, 5);
        System.out.println(vehicle[0].calculateRentalCost(10));
        vehicle[1] = new Car(1, "Kia", 35, 7);
        System.out.println(vehicle[1].calculateRentalCost(6));
        vehicle[2] = new Bike(2, "Ducati", 25, true);
        System.out.println(vehicle[2].calculateRentalCost(2));
        vehicle[3] = new Bike(3,"Tata",10,false);
        System.out.println(vehicle[3].calculateRentalCost(1));

        for(Vehicle v : vehicle){
            v.displayDetails();
            System.out.println(v.calculateRentalCost(5));
        }
    }
}

/*
 * What This Exercise Demonstrates:
 *
 * - Vehicle is the parent class containing common vehicle information
 *   and behavior.
 *
 * - Car and Bike inherit from Vehicle and add their own specific fields.
 *
 * - Car and Bike override displayDetails() to provide their own
 *   implementation.
 *
 * - A Vehicle reference can point to a Car or Bike object.
 *
 * - A Vehicle[] array can store both Car and Bike objects because
 *   they both inherit from Vehicle.
 *
 * - When displayDetails() is called through a Vehicle reference,
 *   Java calls the overridden method belonging to the actual object
 *   (Car or Bike). This is dynamic method dispatch / runtime polymorphism.
 *
 * - calculateRentalCost() is inherited from Vehicle and can be called
 *   on both Car and Bike objects.
 */
