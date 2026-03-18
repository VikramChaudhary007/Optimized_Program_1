package Optimized_Program_1.Mini_Project;

// EmployeeLogSystemMain.java
// Main program: Menu-driven Employee Management System

import java.util.Scanner;

public class EmployeeLogSystemMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EmployeeManager manager = new EmployeeManager();

        // Load employees from file
        manager.loadEmployees();
        LoggerUtil.writeLog("Application started");

        while (true) {
            System.out.println("\n===== Employee Management System =====");
            System.out.println("1 Add Employee");
            System.out.println("2 Delete Employee");
            System.out.println("3 Update Employee");
            System.out.println("4 Search Employee");
            System.out.println("5 View Employees");
            System.out.println("6 Employee Count");
            System.out.println("7 Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // Clear buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter employee name: ");
                    String name = sc.nextLine();
                    manager.addEmployee(name);
                    break;
                case 2:
                    System.out.print("Enter employee name to delete: ");
                    name = sc.nextLine();
                    manager.deleteEmployee(name);
                    break;
                case 3:
                    System.out.print("Enter old employee name: ");
                    String oldName = sc.nextLine();
                    System.out.print("Enter new employee name: ");
                    String newName = sc.nextLine();
                    manager.updateEmployee(oldName, newName);
                    break;
                case 4:
                    System.out.print("Enter employee name to search: ");
                    name = sc.nextLine();
                    manager.searchEmployee(name);
                    break;
                case 5:
                    manager.viewEmployees();
                    break;
                case 6:
                    manager.employeeCount();
                    break;
                case 7:
                    manager.saveEmployees();
                    LoggerUtil.writeLog("Application closed");
                    System.out.println("Program ended.");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
