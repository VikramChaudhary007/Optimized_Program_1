package Optimized_Program_1.Employee_Stream_Sorting;  // Same package as Employee.java


import java.util.*; // Import List, ArrayList, Comparator

// Main class to demonstrate Stream API sorting operations on Employee objects
public class EmployeeMain {

    public static void main(String[] args) {

        // 1. Create a list to store Employee objects
        List<Employee> employees = new ArrayList<>();

        // 2. Add employee objects to the list
        employees.add(new Employee(1, "Rahul", 50000));
        employees.add(new Employee(2, "Amit", 70000));
        employees.add(new Employee(3, "Neha", 60000));
        employees.add(new Employee(4, "Priya", 90000));
        employees.add(new Employee(5, "Karan", 40000));

        // 3. Sort employees by salary in ascending order
        System.out.println("Employees sorted by salary (Ascending):");
        employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary)) // Sort ascending
                .forEach(System.out::println); // Print each employee

        // 4. Sort employees by salary in descending order
        System.out.println("\nEmployees sorted by salary (Descending):");
        employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed()) // Sort descending
                .forEach(System.out::println); // Print each employee
    }
}
