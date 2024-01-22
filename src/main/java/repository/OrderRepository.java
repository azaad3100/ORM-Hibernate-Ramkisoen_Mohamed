package repository;

import entity.Orders;
import entity.Role;
import jakarta.persistence.EntityManager;

public class OrderRepository {

    private EntityManager entityManager;

    public OrderRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public Orders createOrders(Orders orders) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(orders);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return orders;
    }
}
