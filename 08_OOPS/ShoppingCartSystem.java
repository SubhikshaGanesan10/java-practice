/*
 * Exercise: Shopping Cart System
 *
 * Create a Product class with:
 * - productId
 * - name
 * - price
 * - calculatePrice(int quantity)
 * - displayDetails()
 *
 * Create ElectronicsProduct and GroceryProduct classes
 * that inherit from Product.
 *
 * ElectronicsProduct:
 * - Add warrantyFee
 * - Override calculatePrice()
 * - Add warranty fee to the base price
 * - Override displayDetails()
 * - Use super.calculatePrice(quantity)
 * - Use super.displayDetails()
 *
 * GroceryProduct:
 * - Add discountPercentage
 * - Override calculatePrice()
 * - Apply discount to the base price
 * - Override displayDetails()
 * - Use super.calculatePrice(quantity)
 * - Use super.displayDetails()
 *
 * Requirements:
 * - Create 2 normal Products
 * - Create 2 ElectronicsProducts
 * - Create 2 GroceryProducts
 * - Store all products in a Product array
 * - Use one loop to process all products
 * - Calculate the total cart value
 *
 * Validation:
 * - Quantity must be greater than 0
 * - Warranty fee cannot be negative
 * - Discount percentage cannot be negative
 * - Discount percentage cannot be greater than 100
 */

class ShoppingProduct{
    private int productId;
    private String name;
    private double price;

    public ShoppingProduct(int productId, String name, double price){
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public double calculatePrice(int quantity){
        if(quantity <= 0){
            System.out.println("Invalid Quantity");
            return 0;
        }
        return  price*quantity;
    }

    public void displayDetails(){
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + name);
    }
}

class ElectronicsProduct extends ShoppingProduct{
    private double warrantyFee;

    public ElectronicsProduct(int productId, String name, double price, double warrantyFee){
        super(productId, name, price);
        this.warrantyFee = warrantyFee;
    }

    @Override 
    public double calculatePrice(int quantity){
        if(warrantyFee < 0){
            System.out.println("Invalid Warranty Fee");
            return 0;
        }

        return super.calculatePrice(quantity) + warrantyFee; 
    }

    @Override public void displayDetails(){
        super.displayDetails();
        System.out.println("Warranty Fee: " + warrantyFee);
    }
}

class GroceryProduct extends ShoppingProduct{
    private double discountPercentage;

    public GroceryProduct(int productId, String name, double price, double discountPercentage){
        super(productId, name, price);
        this.discountPercentage = discountPercentage;
    }

    @Override 
    public double calculatePrice(int quantity){
        double price = super.calculatePrice(quantity);
        if(discountPercentage >= 0 && discountPercentage <= 100){
            return price - price*discountPercentage/100;
        }
        else{
            System.out.println("Invalid discount price");
            return 0;
        }
    }

    @Override public void displayDetails(){
        super.displayDetails();
        System.out.println("Discount Percentage: " + discountPercentage);
    }

}

public class ShoppingCartSystem {
    public static void main(String[] args) {
        ShoppingProduct[] products = new ShoppingProduct[6];
        products[0] = new ShoppingProduct(1, "Towels", 15);
        products[1] = new ShoppingProduct(2, "Journal", 22);
        products[2] = new ElectronicsProduct(3, "Ipad", 1500, 120);
        products[3] = new ElectronicsProduct(4, "Nintendo Switch", 2050, 100);
        products[4] = new GroceryProduct(5, "Pasta", 13,2);
        products[5] = new GroceryProduct(6, "Bread", 4, 10);

        double totalPrice = 0;
        
        for(ShoppingProduct product : products){
            double price = product.calculatePrice(5);
            product.displayDetails();
            System.out.println("Product Price: " + price);
            totalPrice += price;
        }

        System.out.println("\n");
        System.out.println("Total Price of Products Purchased: " + totalPrice);

    }
}
