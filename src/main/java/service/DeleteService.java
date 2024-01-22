package service;

import configuration.JPAConfiguration;
import entity.Customer;
import jakarta.persistence.EntityManager;

import java.util.Scanner;

public class DeleteService {
    private static EntityManager entityManager = JPAConfiguration.getEntityManager();

    public static void deleteCustomer(){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the user ID the customer to delete: ");
        int cus_id = input.nextInt();

        Customer customer = entityManager.find(Customer.class, cus_id);

        entityManager.getTransaction();
        entityManager.remove(customer);
        entityManager.getTransaction().commit();
        System.out.println("Customer has been deleted successfully!");
        MainMenuService.subMenu();

    }

}
