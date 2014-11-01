package examples.repository;

import examples.domain.Customer;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by serhii on 01.11.14.
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
