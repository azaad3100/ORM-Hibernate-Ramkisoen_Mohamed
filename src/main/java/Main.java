import entity.*;
import service.*;

import java.util.Set;


public class Main {

    public static void main(String[] args) {

        //save role info
        Role saveRole = new Role();
        saveRole.setRole_name("Admin");

        RoleService roleService = new RoleService();
        Role roleDetail = roleService.createRole(saveRole);

        Employee saveEmployee = new Employee();
        saveEmployee.setfName("Azaad");
        saveEmployee.setlName("Ramkisoen");
        saveEmployee.setNumber(333344);
        saveEmployee.setUsername("azp");
        saveEmployee.setPassword("1234");
        saveEmployee.setRole_id(roleDetail);

        EmployeeService employeeService = new EmployeeService();
        Employee empDetail = employeeService.createEmployee(saveEmployee);

        Customer saveCustomer = new Customer();
        saveCustomer.setfName("Shivan");
        saveCustomer.setlName("Angnoe");
        saveCustomer.setNumber(99988);
        saveCustomer.setEmp_id(empDetail);

        CustomersService customersService = new CustomersService();
        Customer cusDetail = customersService.createCustomer(saveCustomer);


        Product saveProducts = new Product();
        saveProducts.setProdQuantity(10);
        saveProducts.setProdPrice(20.00);
        saveProducts.setProdName("Battery");

        Orders saveOrder = new Orders();
        saveOrder.setDate("2000");
        saveOrder.setQuantity(100);
        saveOrder.setPrice_total(10.00);
        saveOrder.setCust_id(cusDetail);
        saveOrder.getProducts().add(saveProducts);

        saveProducts.getOrders().add(saveOrder);

        ProductService productService = new ProductService();
        productService.createProduct(saveProducts);

        OrdersService ordersService = new OrdersService();
        Orders orderDetail = ordersService.createOrders(saveOrder);





        /*List<Gebruiker> gebruikers = gebruikerService.getGebruikers();
        gebruikers.forEach( gebruiker -> {
            System.out.println("Voornaam = " + gebruiker.getVoornaam() + "Achternaam = " + gebruiker.getAchternaam());
        });*/




    }
}
