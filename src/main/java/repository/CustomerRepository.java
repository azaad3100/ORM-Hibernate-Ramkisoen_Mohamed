package repository;

import entity.Customer;
import entity.Employee;
import jakarta.persistence.EntityManager;

public class CustomerRepository {
    private EntityManager entityManager;

    public CustomerRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public Customer createCustomer(Customer customer){
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(customer);
            entityManager.getTransaction().commit();
        }
        catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        }

        return customer;
    }
}
