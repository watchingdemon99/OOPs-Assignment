package EmployeeManagement;

class Employee {
    protected String employeeName;
    protected int employeeId;
    protected int presentDays;


    public void displayDetails(){
        System.out.println("Employee name: "+ employeeName+"\nEmployee ID: "+employeeId+"\nPresent Days: "+ presentDays);
    }

    public int getAvailablePaidLeaves() {
        return availablePaidLeaves;
    }

    public void setAvailablePaidLeaves(int availablePaidLeaves) {
        this.availablePaidLeaves = availablePaidLeaves;
    }

    protected int availablePaidLeaves;

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getPresentDays() {
        return presentDays;
    }

    public void setPresentDays(int presentDays) {
        this.presentDays = presentDays;
    }

    public int getPayPerDay() {
        return payPerDay;
    }

    public void setPayPerDay(int payPerDay) {
        this.payPerDay = payPerDay;
    }

    public int getNumberOfAbsentDays() {
        return numberOfAbsentDays;
    }

    public void setNumberOfAbsentDays(int numberOfAbsentDays) {
        this.numberOfAbsentDays = numberOfAbsentDays;
    }

    protected int payPerDay;
    protected int numberOfAbsentDays;



    public void calculateSalary() {
        System.out.println("The salary of Employee is: " + presentDays * payPerDay);
    }
}

class FullTimeEmployee extends Employee {
    private int usedPaidLeaves;

    @Override
    public void calculateSalary() {
        System.out.println("The salary of  is: " + (presentDays * payPerDay) + usedPaidLeaves * payPerDay);
    }

    public int getUsedPaidLeaves() {
        return usedPaidLeaves;
    }

    public void setUsedPaidLeaves(int usedPaidLeaves) {
        this.usedPaidLeaves = usedPaidLeaves;
    }

    public FullTimeEmployee(int employeeId, int presentDays, int payPerDay, String employeeName, int usedPaidLeaves, int availablePaidLeaves) {
        this.usedPaidLeaves = usedPaidLeaves;
        this.availablePaidLeaves = availablePaidLeaves;
        this.employeeId = employeeId;
        this.payPerDay = payPerDay;
        this.employeeName = employeeName;
        this.presentDays = presentDays;
    }
}

class PartTimeEmployee extends Employee {
    private final int hourlyRate;
    private int hoursWorked;


    @Override
    public void calculateSalary() {
        System.out.println("The salary is: " + hourlyRate * hoursWorked);
    }

    public PartTimeEmployee(int employeeId, int hourlyRate, int hoursWorked, String employeeName) {
        this.employeeId = employeeId;
        this.hourlyRate = hourlyRate;
        this.employeeName = employeeName;
        this.hoursWorked = hoursWorked;

    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(1, 10, 10,
                "Jenkins", 2, 0);
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee(2,2,100,"Kenjins");

        fullTimeEmployee.displayDetails();
        fullTimeEmployee.calculateSalary();
        partTimeEmployee.displayDetails();
        partTimeEmployee.calculateSalary();



    }
}

