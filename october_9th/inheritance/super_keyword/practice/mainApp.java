package october_9th.inheritance.super_keyword.practice;

class Employee {
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    String department;

    public Manager(String name, double salary, String department) {
        super(name, salary); 
        this.department = department;
    }

    @Override
    public void displayDetails() {
        super.displayDetails(); 
        System.out.println("Department: " + department);
        System.out.println("Role: Manager");
    }
}

public class mainApp {
    public static void main(String[] args) {
        Manager manager = new Manager("Pratik Godase", 50000, "IT");
        manager.displayDetails();
    }
}