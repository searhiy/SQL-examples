package examples.repository;

import examples.domain.Client;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by serhii on 01.11.14.
 */
public interface ClientRepository extends CrudRepository<Client, Long> {

}
