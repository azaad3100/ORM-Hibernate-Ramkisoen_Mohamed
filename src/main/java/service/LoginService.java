package service;

import configuration.JPAConfiguration;
import entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

import java.util.Scanner;

public class LoginService {
    private static EntityManager entityManager = JPAConfiguration.getEntityManager();
    public static void checkCredentials(){
        Scanner input = new Scanner(System.in);


        while (true) {
            try {
                System.out.println("Enter your username: ");
                String username = input.nextLine();

                System.out.println("Enter your password: ");
                String password = input.nextLine();

                Query query = entityManager.createQuery("SELECT u FROM Employee u WHERE u.username = :username AND u.password = :password");
                query.setParameter("username", username);
                query.setParameter("password", password);

                if (query.getResultList().isEmpty()) {
                    System.out.println("Invalid username or password. Please try again.");
                } else {
                    Employee emp = (Employee) query.getSingleResult();
                    System.out.println("Login successful!");
                    MainMenuService.subMenu();
                    break;
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please try again.");
                MainMenuService.login();
            }
        }
    }

}
