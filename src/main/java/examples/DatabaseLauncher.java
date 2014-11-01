package examples;

import examples.domain.Address;
import examples.domain.Customer;
import examples.repository.CustomerRepository;
import examples.service.AddressService;
import examples.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Service for launching database according to defined database (see property file).
 */
public class DatabaseLauncher {

    public static void main( String[] args ) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomerService customerService = (CustomerService)ctx.getBean("customer_service");
        AddressService addressService = (AddressService)ctx.getBean("address_service");
        List<Address> addresses = DataGenerator.generateAddresses();
        for (Address address : addresses) {
            addressService.saveAddress(address);
        }
        List<Customer> customers = DataGenerator.generateCustomers(addresses);
        for (Customer customer : customers) {
            customerService.saveCustomer(customer);
        }
    }
}
