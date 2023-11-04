package labtask18;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public int compareTo(Employee otherEmployee) {
        return this.name.compareTo(otherEmployee.getName());
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }
}

class EmployeeSalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        // Compare employees based on their salaries using a custom comparator
        return Double.compare(emp1.getSalary(), emp2.getSalary());
    }
}

public class Question1 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "John", 50000.0));
        employees.add(new Employee(102, "Alice", 60000.0));
        employees.add(new Employee(103, "Bob", 55000.0));
        employees.add(new Employee(104, "David", 52000.0));

        Collections.sort(employees);
        System.out.println("Employees sorted by name (natural ordering):");
        for (Employee emp : employees) {
            System.out.println(emp);
        }

        Collections.sort(employees, new EmployeeSalaryComparator());
        System.out.println("\nEmployees sorted by salary (custom comparator):");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
