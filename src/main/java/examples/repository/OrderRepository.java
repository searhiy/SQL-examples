package examples.repository;

import examples.domain.Order;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by serhii on 01.11.14.
 */
public interface OrderRepository extends CrudRepository<Order, Long> {
}
