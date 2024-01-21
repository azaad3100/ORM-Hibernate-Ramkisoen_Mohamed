import entity.Customer;
import entity.Employee;
import entity.Role;
import service.CustomersService;
import service.EmployeeService;
import service.RoleService;

public class Main {

    public static void main(String[] args) {

        EmployeeService employeeService = new EmployeeService();
        RoleService roleService = new RoleService();
        CustomersService customersService = new CustomersService();

        Role saveRole = new Role();
        saveRole.setRole_name("Admin");
        Role roleDetail = roleService.createRole(saveRole);

        Employee saveEmployee = new Employee();
        saveEmployee.setfName("Azaad");
        saveEmployee.setlName("Ramkisoen");
        saveEmployee.setNumber(333344);
        saveEmployee.setUsername("azp");
        saveEmployee.setPassword("1234");
        saveEmployee.setRole_id(roleDetail);

        Employee empDetail = employeeService.createEmployee(saveEmployee);

        Customer saveCustomer = new Customer();
        saveCustomer.setfName("Shivan");
        saveCustomer.setlName("Angnoe");
        saveCustomer.setNumber(99988);
        saveCustomer.setEmp_id(empDetail);

        customersService.createCustomer(saveCustomer);







        /*List<Gebruiker> gebruikers = gebruikerService.getGebruikers();
        gebruikers.forEach( gebruiker -> {
            System.out.println("Voornaam = " + gebruiker.getVoornaam() + "Achternaam = " + gebruiker.getAchternaam());
        });*/




    }
}
