package service;

import configuration.JPAConfiguration;
import entity.Customer;
import repository.CustomerRepository;
public class CustomersService {

    private CustomerRepository customersRepo;

    public CustomersService() {
        this.customersRepo = new CustomerRepository(JPAConfiguration.getEntityManager());
    }

    public Customer createCustomer(Customer customer){
        return customersRepo.createCustomer(customer);
    }

}