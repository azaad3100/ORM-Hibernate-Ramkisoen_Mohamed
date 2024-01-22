package service;

import configuration.JPAConfiguration;
import entity.Customer;
import entity.Employee;
import jakarta.persistence.EntityManager;

import java.util.List;

public class reportService {
    private static EntityManager entityManager = JPAConfiguration.getEntityManager();

    public static void reportEmployees(){

        List<Employee> employeeList = entityManager.createQuery("SELECT u FROM Employee u", Employee.class).getResultList();
        System.out.println("Employee Report:");
        System.out.println("ID\tName\tLastname");
        for (Employee employee : employeeList) {
            System.out.println(employee.getEmp_id()+ "\t" + employee.getfName()+ "\t" + employee.getlName());
        }
        MainMenuService.subMenu();
    }

    public static void reportCustomers(){

        List<Customer> customerList = entityManager.createQuery("SELECT u FROM Customer u", Customer.class).getResultList();
        System.out.println("Customer Report:");
        System.out.println("id\tName\tLastname\tNumber");
        for (Customer customer : customerList) {
            System.out.println(customer.getId()+ "\t" + customer.getfName()+ "\t" + customer.getlName() + "\t" +customer.getNumber());
        }
        MainMenuService.subMenu();
    }
}
