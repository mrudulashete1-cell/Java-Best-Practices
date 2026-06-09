/**
 * Demonstrates Java Best Practices.
 * Calculates annual salary of an employee.
 */
public class EmployeeSalaryCalculator {

    // Constant value
    private static final int MONTHS_IN_YEAR = 12;

    public static void main(String[] args) {

        Employee employee = new Employee("John Doe", 25000);

        double annualSalary = calculateAnnualSalary(employee);

        System.out.println("Employee Name : " + employee.getName());
        System.out.println("Monthly Salary: ₹" + employee.getMonthlySalary());
        System.out.println("Annual Salary : ₹" + annualSalary);
    }

    /**
     * Calculates annual salary.
     *
     * @param employee Employee object
     * @return annual salary
     */
    public static double calculateAnnualSalary(Employee employee) {
        return employee.getMonthlySalary() * MONTHS_IN_YEAR;
    }
}

/**
 * Employee class demonstrating encapsulation.
 */
class Employee {

    private String name;
    private double monthlySalary;

    public Employee(String name, double monthlySalary) {
        setName(name);
        setMonthlySalary(monthlySalary);
    }

    public String getName() {
        return name;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Employee name cannot be empty.");
        }
        this.name = name;
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary < 0) {
            throw new IllegalArgumentException("Salary cannot be negative.");
        }
        this.monthlySalary = monthlySalary;
    }
}