package Optimized_Program_1.Mini_Project;

// EmployeeManager.java
// Handles employee operations (CRUD) and file handling

import java.io.*;
import java.util.ArrayList;

public class EmployeeManager {

    private ArrayList<Employee> employees = new ArrayList<>();
    private final String employeeFile = "D:\\Project_TY\\Optimized_Program_1\\Mini_Project\\employees.txt";

    // Load employees from file
    public void loadEmployees() {
        try (BufferedReader reader = new BufferedReader(new FileReader(employeeFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                employees.add(new Employee(line));
            }
            LoggerUtil.writeLog("Employees loaded from file");
        } catch (IOException e) {
            System.out.println("No employee file found. Starting fresh.");
        }
    }

    // Save employees to file
    public void saveEmployees() {
        try (FileWriter writer = new FileWriter(employeeFile)) {
            for (Employee emp : employees) {
                writer.write(emp.getName() + "\n");
            }
            LoggerUtil.writeLog("Employees saved to file");
        } catch (IOException e) {
            System.out.println("Error saving employees.");
        }
    }

    // Add new employee
    public void addEmployee(String name) {
        Employee emp = new Employee(name);
        employees.add(emp);
        System.out.println("Employee added: " + name);
        LoggerUtil.writeLog("Employee added: " + name);
    }

    // Delete employee
    public void deleteEmployee(String name) {
        Employee empToRemove = null;
        for (Employee emp : employees) {
            if (emp.getName().equalsIgnoreCase(name)) {
                empToRemove = emp;
                break;
            }
        }

        if (empToRemove != null) {
            employees.remove(empToRemove);
            System.out.println("Employee deleted: " + name);
            LoggerUtil.writeLog("Employee deleted: " + name);
        } else {
            System.out.println("Employee not found.");
            LoggerUtil.writeLog("Delete failed: " + name);
        }
    }

    // Update employee name
    public void updateEmployee(String oldName, String newName) {
        for (Employee emp : employees) {
            if (emp.getName().equalsIgnoreCase(oldName)) {
                emp.setName(newName);
                System.out.println("Employee updated.");
                LoggerUtil.writeLog("Employee updated: " + oldName + " -> " + newName);
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    // Search employee
    public void searchEmployee(String name) {
        for (Employee emp : employees) {
            if (emp.getName().equalsIgnoreCase(name)) {
                System.out.println("Employee found: " + name);
                LoggerUtil.writeLog("Employee searched: " + name);
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    // View all employees
    public void viewEmployees() {
        System.out.println("\n------ Employee List ------");
        if (employees.isEmpty()) {
            System.out.println("No employees available.");
        } else {
            int i = 1;
            for (Employee emp : employees) {
                System.out.println(i + ". " + emp.getName());
                i++;
            }
        }
        System.out.println("---------------------------");
        LoggerUtil.writeLog("Viewed employee list");
    }

    // Count total employees
    public void employeeCount() {
        System.out.println("Total Employees: " + employees.size());
        LoggerUtil.writeLog("Checked employee count");
    }
}
