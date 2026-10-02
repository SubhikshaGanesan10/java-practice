/*
 * Exercise: Vehicle Rental Pricing
 *
 * Create a Vehicle class with:
 * - vehicleId
 * - brand
 * - rentalPricePerDay
 * - calculateRentalCost(int days)
 * - displayDetails()
 *
 * Create Car and Bike classes that inherit from Vehicle.
 *
 * Car:
 * - Add insuranceFee
 * - Override calculateRentalCost()
 * - Add insurance fee to the basic rental cost
 * - Override displayDetails()
 *
 * Bike:
 * - Add helmetFee
 * - Override calculateRentalCost()
 * - Add helmet fee to the basic rental cost
 * - Override displayDetails()
 *
 * Requirements:
 * - Use super.calculateRentalCost(days) in the child classes
 * - Use super.displayDetails() in the child classes
 * - Create 2 Cars and 2 Bikes
 * - Store all vehicles in a Vehicle array
 * - Use one loop to display details and calculate rental costs
 * - Calculate the total rental cost
 */

class VehicleRental{
    private int vehicleId;
    private String brand;
    private double rentalPricePerDay;

    public VehicleRental(int vehicleId, String brand, double rentalPricePerDay){
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.rentalPricePerDay = rentalPricePerDay;
    }
    
    public double calculateRentalCost(int days){
        return rentalPricePerDay*days;
    }

    public void displayDetails(){
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Brand: " + brand);

    }    

}

class Car extends VehicleRental{
    private double insuranceFee;

    public Car(int vehicleId, String brand, double rentalPricePerDay, double insuranceFee){
        super(vehicleId, brand, rentalPricePerDay);
        this.insuranceFee = insuranceFee;
    }

    @Override 
    public double calculateRentalCost(int days){
        return super.calculateRentalCost(days) + insuranceFee;
    }

    @Override 
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Insurance Fee: " + insuranceFee);
    }
}

class Bike extends VehicleRental{
    private double helmetFee;

    public Bike(int vehicleId, String brand, double rentalPricePerDay, double helmetFee){
        super(vehicleId, brand, rentalPricePerDay);
        this.helmetFee = helmetFee;
    }

    @Override 
    public double calculateRentalCost(int days){
        return super.calculateRentalCost(days) + helmetFee;
    }

    @Override 
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Helmet Fee: " + helmetFee);
    }
}

public class VehicleRentalPricing {
    public static void main(String[] args) {
        VehicleRental[] vehicle = new VehicleRental[4];
        vehicle[0] = new Car(1, "Ford", 15.5, 100);
        vehicle[1] = new Car(2, "Volvo", 23.5, 200);
        vehicle[2] = new Bike(2, "TVS", 7, 30);
        vehicle[3] = new Bike(4, "Vespa", 9, 30);

        double totalRentalCost = 0;

        for(VehicleRental v : vehicle){
            v.displayDetails();
            double rentalCost = v.calculateRentalCost(5);
            totalRentalCost += rentalCost;
            System.out.println("Rental Cost of Vehicle: " + rentalCost);
        }

        System.out.println("Total Rental Cost: " + totalRentalCost);
    }
}
