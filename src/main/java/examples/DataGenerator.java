package examples;

import examples.domain.Address;
import examples.domain.Customer;
import examples.repository.CustomerRepository;
import examples.util.AddressProcessor;
import examples.util.CSVReader;
import examples.util.CustomerProcessor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by serhii on 01.11.14.
 */
public class DataGenerator {

    public static List<Customer> generateCustomers(List<Address> addresses) {
        List<Customer> customers = new ArrayList<>();
        customers = (List<Customer>)CSVReader.readCsv("data/customer/names.csv", new CustomerProcessor(addresses));
        return customers;
    }

    public static List<Address> generateAddresses() {
        List<Address> addresses = new ArrayList<>();
        addresses = (List<Address>)CSVReader.readCsv("data/customer/addresses.csv", new AddressProcessor());
        return addresses;
    }

}
