/*
 * Exercise: Employee Salary Calculator
 *
 * Create an Employee class.
 *
 * Requirements:
 * - Create private fields: id, name, and salary
 * - Create a parameterized constructor to initialize the fields
 * - Create increaseSalary(double percentage)
 * - Create getAnnualSalary()
 * - Create displayEmployeeDetails()
 * - Create 3 Employee objects
 * - Store the Employee objects in an array
 * - Use a loop to process the employees
 *
 * Salary Rules:
 * - Annual salary = monthly salary * 12
 * - Salary increase = salary + (salary * percentage / 100)
 * - Percentage must be greater than 0
 * - Display "Invalid Percentage" for an invalid percentage
 */

class SalaryEmployee{
    private int id;
    private String name;
    private double salary;

    public SalaryEmployee(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void increaseSalary(double percentage){
        if(percentage > 0){
            salary = (salary + (salary*percentage/100));
        } 
        else{
            System.out.println("Invalid Percentage");
        }
    }

    public double getAnnualSalary(){
        return salary*12;
    }

    public void displayEmployeeDetails(){
        System.out.println("Employee ID: " + id + "\nEmployee Name: " + name + "\nMonthly Salary: " + salary);
    }
}

public class EmployeeSalaryCalculator {
    public static void main(String[] args) {
        SalaryEmployee employee1 = new SalaryEmployee(1, "Alice", 5000);
        employee1.increaseSalary(10);
        SalaryEmployee employee2 = new SalaryEmployee(2, "Bob", 6000);
        employee2.increaseSalary(20);
        SalaryEmployee employee3 = new SalaryEmployee(3, "Charles", 7500);
        employee3.increaseSalary(5);

        SalaryEmployee employee[] = new SalaryEmployee[3];
        employee[0] = employee1;
        employee[1] = employee2;
        employee[2] = employee3;
        for(SalaryEmployee emp : employee){
            emp.displayEmployeeDetails();
            System.out.println("Annual Salary: " +emp.getAnnualSalary());
        }
    }
    
}
