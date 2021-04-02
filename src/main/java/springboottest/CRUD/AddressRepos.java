package springboottest.CRUD;


import org.springframework.data.jpa.repository.JpaRepository;
import springboottest.model.Salespointdo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface AddressRepos extends JpaRepository<Salespointdo,Integer> {


}
