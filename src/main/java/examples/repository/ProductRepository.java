package examples.repository;

import examples.domain.Product;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by serhii on 26.01.15.
 */
public interface ProductRepository extends CrudRepository<Product,Long>{
}
