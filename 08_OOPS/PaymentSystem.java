/*
 * Exercise: Payment System
 *
 * Create a Payment class with:
 * - paymentId
 * - amount
 * - processPayment()
 * - displayPaymentDetails()
 *
 * Create CreditCardPayment and UPIPayment classes
 * that inherit from Payment.
 *
 * CreditCardPayment:
 * - Add transactionFee
 * - Override processPayment()
 * - Add transaction fee to the payment amount
 * - Override displayPaymentDetails()
 *
 * UPIPayment:
 * - Add cashback
 * - Override processPayment()
 * - Subtract cashback from the payment amount
 * - Override displayPaymentDetails()
 *
 * Requirements:
 * - Use super.displayPaymentDetails() in child classes
 * - Create 2 Credit Card payments and 2 UPI payments
 * - Store all payments in a Payment array
 * - Use one loop to process all payments
 * - Calculate the total amount charged
 *
 * Validation:
 * - Payment amount must be greater than 0
 * - Transaction fee cannot be negative
 * - Cashback cannot be negative
 * - Cashback cannot be greater than the payment amount
 */

class Payment{
    private int paymentId;
    private double amount;

    public Payment(int paymentId, double amount){
        this.paymentId = paymentId;
        this.amount = amount;
    }
 
    public double processPayment(){
        if(amount < 0){
            System.out.println("Invalid");
        }
        return amount;
    }
    
    public void displayPaymentDetails(){
        System.out.println("Payment ID: " + paymentId);
    }
}

class CreditCardPayment extends Payment{
    private double transactionFee;

    public CreditCardPayment(int paymentId, double amount, double transactionFee){
        super(paymentId, amount);
        this.transactionFee = transactionFee;
    }

    @Override
    public double processPayment(){
        if(transactionFee < 0){
            System.out.println("Invalid");
        }
        return super.processPayment() + transactionFee;
    }

    @Override
    public void displayPaymentDetails(){
        super.displayPaymentDetails();
        System.out.println("Transaction Fee: " + transactionFee);
    }
}

class UPIPayment extends Payment{
    private double cashback;

    public UPIPayment(int paymentId, double amount, double cashback){
        super(paymentId, amount);
        this.cashback = cashback;
    }

    @Override
    public double processPayment(){
        if(cashback < 0 || cashback > super.processPayment()){
            System.out.println("Invalid");
        }
        return super.processPayment() - cashback;
    }

    @Override
    public void displayPaymentDetails(){
        super.displayPaymentDetails();
        System.out.println("Cashback Bonus: "+ cashback);
    }
}

public class PaymentSystem {
    public static void main(String[] args) {
        Payment[] payment = new Payment[4];
        payment[0] = new CreditCardPayment(1,5000,35 );
        payment[1] = new CreditCardPayment(2,300,5 );
        payment[2] = new UPIPayment(1,500, 50);
        payment[3] = new UPIPayment(2,1500, 65);

        double totalPaymentAmount = 0;

        for(Payment p : payment){
            p.displayPaymentDetails();
            double amount = p.processPayment();
            totalPaymentAmount += amount;
            System.out.println("PaymentAmount: " + amount);
        }
        System.out.println("Total Payment Amount: " + totalPaymentAmount);
    }
}
