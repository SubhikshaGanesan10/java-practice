/*
 * Exercise: Product Inventory
 *
 * Create a Product class.
 *
 * Requirements:
 * - Create private fields: productId, name, price, and quantity
 * - Create a parameterized constructor to initialize the fields
 * - Create addStock(int amount)
 * - Create removeStock(int amount)
 * - Create getTotalValue()
 * - Create displayProductDetails()
 * - Create at least 3 Product objects
 * - Store the Product objects in an array
 * - Use a loop to process the products
 * - Calculate the total inventory value of the store
 *
 * Validation:
 * - Stock amount must be greater than 0
 * - Cannot remove more stock than the available quantity
 */
class Product{
    private int productId;
    private String name;
    private double price;
    private int quantity;

    public Product(int productId, String name, double price, int quantity){
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void addStock(int amount){
        if(amount <= 0){
            System.out.println("Invalid amount");
        }
        else{
            quantity += amount;
        }
    }
    
    public void removeStock(int amount){
        if(amount <= 0){
            System.out.println("Invalid amount");
        }
        else if(amount > quantity){
            System.out.println("Insufficient stock available");
        }
        else{
            quantity -= amount;
        }
    }
    public double getTotalValue(){
        return quantity*price;
    }
    public void displayProductDetails(){
        System.out.println("productID: " + productId + "\nProduct Name: " + name + "\nPrice: " + price + "\nQuantity: " + quantity);
    }
}

public class ProductInventory {
    public static void main(String[] args) {
        Product product1 = new Product(1,"Mattress",530,5);
        product1.addStock(10);
        product1.removeStock(1);
        Product product2 = new Product(2,"Couch",2260,100);
        product2.addStock(50);
        product2.removeStock(71);
        Product product3 = new Product(3,"Recliner Chair",5610,52);

        Product[] products = new Product[3];
        products[0] = product1;
        products[1] = product2;
        products[2] = product3;

        double totalInventoryValue = 0;
        for(Product prod : products){
            prod.displayProductDetails();
            double productValue = prod.getTotalValue();
            System.out.println("Total Value of Product: " + productValue);
            totalInventoryValue += productValue;
        }
        System.out.println("Total Inventory Stock Value: " + totalInventoryValue);
    }
}
