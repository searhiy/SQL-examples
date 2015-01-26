package examples.service;

import examples.domain.Order;

/**
 * Created by serhii on 01.11.14.
 */
public interface OrderService {

    public void saveOrders(Iterable<Order> orders);
}
