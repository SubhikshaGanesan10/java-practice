/*
 * Exercise: Employee Payroll System
 *
 * Create an Employee class with:
 * - id
 * - name
 * - baseSalary
 * - calculateSalary()
 * - displayDetails()
 *
 * Create FullTimeEmployee and PartTimeEmployee classes
 * that inherit from Employee.
 *
 * FullTimeEmployee:
 * - Add bonus
 * - Override calculateSalary()
 * - Override displayDetails()
 *
 * PartTimeEmployee:
 * - Add hoursWorked
 * - Add hourlyRate
 * - Override calculateSalary()
 * - Override displayDetails()
 *
 * Requirements:
 * - Create 2 Full-Time Employees and 2 Part-Time Employees
 * - Store all employees in an Employee array
 * - Use one loop to display details and calculate salaries
 * - Calculate the total payroll
 */
class EmployeeDetails{
    private int id;
    private String name;
    private double baseSalary;

    public EmployeeDetails(int id, String name, double baseSalary){
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public double getBaseSalary(){
        return baseSalary;
    }

    public double calculateSalary(){
        return baseSalary;
    }
    public void displayDetails(){
        System.out.println("Employee Id: " + id);
        System.out.println("Employee Name: " + name);
    }
}

class FullTimeEmployee extends EmployeeDetails{

    double bonus;

    public FullTimeEmployee(int id, String name, double baseSalary, double bonus){
        super(id, name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary(){
        return getBaseSalary() + bonus;
    }

    @Override
    public void displayDetails(){
        System.out.println("Employee Id: " + getId());
        System.out.println("Employee Name: " + getName());
        System.out.println("Base Salary: " + getBaseSalary());
        System.out.println("Bonus Earned: " + bonus);
    }
}

class PartTimeEmployee extends EmployeeDetails{

    int hoursWorked;
    double hourlyRate;

    public PartTimeEmployee(int id, String name, double baseSalary, int hoursWorked, double hourlyRate){
        super(id, name, baseSalary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary(){
        return hoursWorked*hourlyRate;
    }

    @Override
    public void displayDetails(){
        System.out.println("Employee Id: " + getId());
        System.out.println("Employee Name: " + getName());
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("HourlyRate: " + hourlyRate);
    }
}

public class EmployeePayrollSystem {
   public static void main(String[] args) {
        EmployeeDetails[] employee = new EmployeeDetails[4];
        employee[0] = new FullTimeEmployee(0, "Alice", 4000,230);
        employee[1] = new FullTimeEmployee(1, "Bob", 7000,800);
        employee[2] = new PartTimeEmployee(2, "Charles", 1500, 20, 23);
        employee[3] = new PartTimeEmployee(3, "Daisy", 650, 45, 17);

        double totalPayroll = 0;

        for(EmployeeDetails emp : employee){
            emp.displayDetails();
            double salary = emp.calculateSalary();
            System.out.println("Salary: " + salary);
            System.out.println();
            totalPayroll += salary;
        }

        System.out.println("Total Payroll:" + totalPayroll);
   } 
}
