package service;

import configuration.JPAConfiguration;
import entity.Orders;
import entity.Role;
import repository.OrderRepository;
import repository.RoleRepository;

public class OrdersService {

    private OrderRepository orderRepository;

    public OrdersService() {
        this.orderRepository = new OrderRepository(JPAConfiguration.getEntityManager());
    }

    public Orders createOrders(Orders orders){
        return orderRepository.createOrders(orders);
    }
}
