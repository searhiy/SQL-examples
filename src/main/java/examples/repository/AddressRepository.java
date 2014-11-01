package examples.repository;

import examples.domain.Address;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by serhii on 01.11.14.
 */
public interface AddressRepository extends CrudRepository<Address, Long> {
}
