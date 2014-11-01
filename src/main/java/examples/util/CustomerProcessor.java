package examples.util;

import examples.domain.Address;
import examples.domain.Customer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by serhii on 01.11.14.
 */
public class CustomerProcessor implements DataProcessor {

    private List<Customer> customers = new ArrayList<>();
    private List<Address> addresses;

    public CustomerProcessor(List<Address> addresses) {
        this.addresses = addresses;
    }

    @Override
    public void processData(String[] data) {
        Collections.shuffle(addresses);
        Customer customer = new Customer.Builder().
                setName(data[0]).
                setAddress(addresses.get(0)).
                build();
        customers.add(customer);
    }

    @Override
    public List<?> getData() {
        return customers;
    }
}
