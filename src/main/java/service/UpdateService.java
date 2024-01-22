package service;

import configuration.JPAConfiguration;
import entity.Employee;
import jakarta.persistence.EntityManager;

import java.util.Scanner;


public class UpdateService {

    private static EntityManager entityManager = JPAConfiguration.getEntityManager();

    public static void updateEmployeeUsername(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter user ID to update: ");
        int id = input.nextInt();
        input.nextLine();

        System.out.println("Enter new user name: ");
        String name = input.nextLine();

        Employee employee = entityManager.find(Employee.class, id);
        employee.setUsername(name);

        entityManager.getTransaction();
        entityManager.merge(employee);
        entityManager.getTransaction().commit();

        System.out.println("Username updated successfully!");
        MainMenuService.subMenu();

    }
}
