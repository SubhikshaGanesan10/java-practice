/*
 * Exercise: Online Order System
 *
 * File name: OnlineOrderSystem.java
 *
 * Create an Order class with:
 * - orderId
 * - customerName
 * - orderAmount
 * - calculateFinalAmount()
 * - displayOrderDetails()
 *
 * Create ExpressOrder and DiscountOrder classes
 * that inherit from Order.
 *
 * ExpressOrder:
 * - Add deliveryFee
 * - Override calculateFinalAmount()
 * - Add delivery fee to the order amount
 * - Override displayOrderDetails()
 * - Use super.calculateFinalAmount()
 * - Use super.displayOrderDetails()
 *
 * DiscountOrder:
 * - Add discountPercentage
 * - Override calculateFinalAmount()
 * - Apply discount to the order amount
 * - Override displayOrderDetails()
 * - Use super.calculateFinalAmount()
 * - Use super.displayOrderDetails()
 *
 * Requirements:
 * - Create 2 normal Orders
 * - Create 2 ExpressOrders
 * - Create 2 DiscountOrders
 * - Store all orders in an Order array
 * - Use one loop to process all orders
 * - Calculate the total order amount
 *
 * Validation:
 * - Order amount must be greater than 0
 * - Delivery fee cannot be negative
 * - Discount percentage cannot be negative
 * - Discount percentage cannot be greater than 100
 */

class Order{
    private int orderId;
    private String customerName;
    private double orderAmount;

    public Order(int orderId, String customerName, double orderAmount){
        this.orderId = orderId;
        this.customerName = customerName;
        this.orderAmount = orderAmount;
    }

    public double calculateFinalAmount(){
        if(orderAmount <= 0){
            System.out.println("Invalid Amount");
            return 0;
        }
        return orderAmount;
    }

    public void displayOrderDetails(){
        System.out.println("Order ID: " +orderId);
        System.out.println("Customer Name: " +customerName);
        System.out.println("Order Amount: " + orderAmount);
    }

}

class ExpressOrder extends Order{
    private double deliveryFee;

    public ExpressOrder(int orderId, String customerName, double orderAmount, double deliveryFee){
        super(orderId, customerName, orderAmount);
        this.deliveryFee = deliveryFee;
    }

    @Override 
    public double calculateFinalAmount(){
        if(deliveryFee < 0){
            System.out.println("Invalid Delivery Fee");
            return 0;
        }
        return super.calculateFinalAmount() + deliveryFee;
    }

    @Override 
    public void displayOrderDetails(){
        super.displayOrderDetails();
        System.out.println("Delivery Fee: " + deliveryFee);
    }

}

class DiscountOrder extends Order{
    private double discountPercentage;

    public DiscountOrder(int orderId, String customerName, double orderAmount, double discountPercentage){
        super(orderId, customerName, orderAmount);
        this.discountPercentage = discountPercentage;
    }

    @Override 
    public double calculateFinalAmount(){
        double amount = super.calculateFinalAmount();
        if(discountPercentage >= 0 && discountPercentage<= 100){
            return amount - amount*discountPercentage/100;
        }
        else{
            System.out.println("Invalid Discount ");
            return 0;
        }
    }

    @Override 
    public void displayOrderDetails(){
        super.displayOrderDetails();
        System.out.println("Discount Percent: " + discountPercentage);
    }

}

public class OnlineOrderSystem {
    public static void main(String[] args) {
        Order[] orders = new Order[6];
        orders[0] = new Order(1,"John", 100);
        orders[1] = new Order(2,"Emily", 130);
        orders[2] = new ExpressOrder(3,"Blake", 76, 10);
        orders[3] = new ExpressOrder(4,"Nancy", 298, 17);
        orders[4] = new DiscountOrder(5,"Katy", 35,5);
        orders[5] = new DiscountOrder(6,"Leo", 100,10);

        double totalAmount = 0;

        for(Order order : orders){
            order.displayOrderDetails();
            double amount = order.calculateFinalAmount();
            System.out.println("Amount: " + amount);
            totalAmount += amount;
        }

        System.out.println("Total Amount: " + totalAmount);
    }
}
