package examples.util;

import examples.domain.Address;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by serhii on 01.11.14.
 */
public class AddressProcessor implements DataProcessor {
    private List<Address> addresses = new ArrayList<>();

    @Override
    public void processData(String[] data) {
        Address address = new Address.Builder().
                setRegion(data[0]).
                setCity(data[1]).
                setStreet(data[2]).
                setPostalCode(data[3]).
                build();
        addresses.add(address);
    }

    @Override
    public List<?> getData() {
        return addresses;
    }
}
