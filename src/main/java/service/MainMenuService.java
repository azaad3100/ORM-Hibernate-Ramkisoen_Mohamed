package service;

import configuration.JPAConfiguration;
import jakarta.persistence.EntityManager;

import java.util.Scanner;

public class MainMenuService {
    private static EntityManager entityManager = JPAConfiguration.getEntityManager();
    public static void login() {
        System.out.println("         Welcome to the Inventorysystem for xyz Repair Shop         ");
        System.out.println("*********************************************************************");
        Scanner input = new Scanner(System.in);
        int choice;

        while (true) {
            try {
                System.out.println("Enter 1 to login or 2 to exit: ");
                choice = Integer.parseInt(input.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number: ");
            }
        }

        switch (choice) {
            case 1:
                System.out.println("You have chosen to login.");
                LoginService.checkCredentials();
                break;
            case 2:
                System.out.println("You have chosen to exit the app.");
                System.exit(0);
                entityManager.close();

                break;
            default:
                System.out.println("Invalid choice. Please enter 1 to login or 2 to exit.");
                break;
        }
    }

    public static void subMenu() {
        System.out.println("                         Controlpanel                               ");
        System.out.println("*********************************************************************");
        Scanner input = new Scanner(System.in);
        int choice;

        while (true) {
            try {
                System.out.println("Choose a option");
                System.out.println("1 : Insert a role");
                System.out.println("2 : Add a new employee");
                System.out.println("3 : View customer report");
                System.out.println("4 : View employees report");
                System.out.println("5 : Update employee username");
                System.out.println("6 : delete a customer");
                System.out.println("7 : Logout");
                System.out.println("8 : Exit");


                choice = Integer.parseInt(input.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number: ");
            }
        }

        switch (choice) {
            case 1:
                System.out.println("Insert a role");
                CreateServices.insertRole();
                break;
            case 2:
                System.out.println("Add a new employee");
                CreateServices.insertEmployees();
                break;

            case 3:
                System.out.println("View customer report");
                reportService.reportCustomers();
                break;

            case 4:
                System.out.println("View employees report");
                reportService.reportEmployees();
                break;

            case 5:
                System.out.println("Update employee username");
                UpdateService.updateEmployeeUsername();
                break;

            case 6:
                System.out.println("delete a customer");
                DeleteService.deleteCustomer();
                break;
            case 7:
                System.out.println("Logging out...............");
                MainMenuService.login();
                break;

            case 8:
                System.out.println("Exiting...........");
                System.out.println("Have a nice day");
                entityManager.close();
                System.exit(0);
                break;

            default:
                System.out.println("Invalid choice. Please enter 1 to login or 2 to exit.");

        }
    }
}
