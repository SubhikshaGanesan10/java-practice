/*
 * Exercise: Bank Account
 *
 * Create a BankAccount class.
 *
 * Requirements:
 * - Create private fields: accountHolder and balance
 * - Create a parameterized constructor to initialize the fields
 * - Create deposit() to add money to the account
 * - Create withdraw() to withdraw money with validation
 * - Create getBalance() to return the current balance
 * - Create displayAccountDetails() to display account information
 *
 * Validation:
 * - Deposit amount must be greater than 0
 * - Withdrawal amount must be greater than 0
 * - Withdrawal amount cannot exceed the available balance
 */

class BankAccount{
    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double balance){
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount){
        if(amount <= 0){
            System.out.println("Invalid Amount Entered");
        }
        else{
            balance += amount;
        }
    }

    public void withdraw(double amount){

        if(amount <= 0){
            System.out.println("Invalid Withdrawal Amount");
        }
        else if(amount > balance){
            System.out.println("Insufficient Balance");
        }
        else{
            balance -= amount;
        }
    }

    public double getBalance(){
        return balance;
    }

    public void displayAccountDetails(){
        System.out.println("Account Holder: " + accountHolder + "\nBalance: " + balance);
    }
}

public class BankAccountManagement {
    public static void main(String[] args){
        BankAccount account = new BankAccount("Subhiksha", 5000);
        account.withdraw(7800);
        System.out.println(account.getBalance());
        account.deposit(1700);
        System.out.println(account.getBalance());
        account.displayAccountDetails();
    }
}
