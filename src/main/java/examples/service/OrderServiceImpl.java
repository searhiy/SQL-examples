package examples.service;

import examples.domain.Order;
import examples.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by serhii on 01.11.14.
 */
@Transactional
@Service("order_service")
@Repository
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void saveOrders(Iterable<Order> orders) {
        orderRepository.save(orders);
    }
}
