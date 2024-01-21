package service;

import configuration.JPAConfiguration;
import entity.Employee;
import repository.EmployeeRepository;

import java.util.List;

public class EmployeeService {

    private final EmployeeRepository repository;

    public EmployeeService() {
        this.repository = new EmployeeRepository(JPAConfiguration.getEntityManager());
    }

    public Employee createEmployee(Employee employee) {
        return repository.createEmployee(employee);
    }
}
