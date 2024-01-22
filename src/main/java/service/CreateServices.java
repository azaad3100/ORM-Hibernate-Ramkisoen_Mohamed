package service;

import configuration.JPAConfiguration;
import entity.Employee;
import entity.Role;
import jakarta.persistence.EntityManager;

import java.util.Scanner;

public class CreateServices {

    private static EntityManager entityManager = JPAConfiguration.getEntityManager();

    public static void insertRole(){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of the new role ");
        String roleName = input.nextLine();
        Role saveRole = new Role();
        saveRole.setRole_name(roleName);

        RoleService roleService = new RoleService();
        roleService.createRole(saveRole);
        System.out.println("Role name inserted successfully!");
        MainMenuService.subMenu();
    }



    public static void insertEmployees(){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the firstname: ");
        String fName = input.nextLine();

        System.out.println("Enter the lastname: ");
        String lName = input.nextLine();

        System.out.println("Enter the phonenumber: ");
        int phone = Integer.parseInt(input.nextLine());

        System.out.println("Enter the username: ");
        String username = input.nextLine();

        System.out.println("Enter the password: ");
        String password = input.nextLine();

        System.out.println(" 4 = Admin  |  5 = Employee");
        System.out.println("Enter the role id: ");
        int roleId = input.nextInt();
        input.nextLine();

        Role role = entityManager.find(Role.class, roleId);

        Employee saveEmployee = new Employee();
        saveEmployee.setfName(fName);
        saveEmployee.setlName(lName);
        saveEmployee.setNumber(phone);
        saveEmployee.setUsername(username);
        saveEmployee.setPassword(password);
        saveEmployee.setRole_id(role);

        EmployeeService employeeService = new EmployeeService();
        employeeService.createEmployee(saveEmployee);
        System.out.println("Role name inserted successfully!");
        MainMenuService.subMenu();

    }


}
