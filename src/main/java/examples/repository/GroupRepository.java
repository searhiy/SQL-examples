package examples.repository;

import examples.domain.Group;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by serhii on 26.01.15.
 */
public interface GroupRepository extends CrudRepository<Group,Long> {
}
