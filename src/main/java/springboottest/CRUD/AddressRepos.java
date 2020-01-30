package springboottest.CRUD;


import springboottest.model.SalesPoint;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface AddressRepos extends CrudRepository<SalesPoint,Long> {

    List<SalesPoint> findByCity(String city);
}
