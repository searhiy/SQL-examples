package examples.util.processors;

import examples.domain.Order;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by serhii on 01.11.14.
 */
public class OrderProcessor implements DataProcessor {
    private List<Order> orders = new ArrayList<>();

    @Override
    public void processData(String[] data) {
        Order address = new Order.Builder().
                setDate(data[0]).
                setClientId(data[1]).
                setProductId(data[2]).
                build();
        orders.add(address);
    }

    @Override
    public List<?> getData() {
        return orders;
    }
}
