// Exploring OOP in Java: Classes, Objects, Inheritance, and Core Principles
// Design a basic employee management system in Java using object-oriented principles.

// You need to:

// Create a base class Employee with:

// Private fields: name (String), salary (double)

// A constructor to initialize these fields

// Public getter methods

// A method getDetails() that returns:

// Name: {name}, Salary: {salary}


// Create a subclass Manager that:

// Has an additional private field: department (String)

// Uses super() to call the parent constructor

// Overrides getDetails() to include the department:

// Name: {name}, Salary: {salary}, Department: {department}


// In the main() method:

// Create one Employee object and one Manager object

// Store both in variables of type Employee

// Print their details using the getDetails() method

// This will demonstrate how inheritance and polymorphism work in Java.


// Instructions:

// Define class Employee and subclass Manager.

// Keep fields private and use a constructor to set values.

// Override getDetails() in the subclass to extend functionality.

// Use super() and this keywords appropriately.

// Print output using System.out.println() and match formatting.

// Expected Output:
//   Name:  Alice,  Salary:  50000.0

//   Name:  Bob,  Salary:  80000.0,  Department:  IT

class Employee{
    private String name;
    private double salary;
    
    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }
    
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
    
    public String getDetails(){
        return "Name: " + name + ", Salary: " + salary;
    }
    
}

class Manager extends Employee{
    private String department;
    
    public Manager(String name, double salary, String department){
        super(name, salary);
        this.department = department;
    }

    public String getDetails(){
        return "Name: " + getName() + ", Salary: " + getSalary() + ", Department: " + department;
    }
}



public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // TODO: Create Employee and Manager objects
        Employee employee = new Employee("Alice", 50000);
        System.out.println(employee.getDetails());
        // TODO: Print their details using getDetails()
        Employee manager = new Manager("Bob", 80000, "IT");
        System.out.println(manager.getDetails());
    }
}

