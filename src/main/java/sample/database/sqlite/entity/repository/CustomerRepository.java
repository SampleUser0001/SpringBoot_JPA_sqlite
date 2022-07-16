package sample.database.sqlite.entity.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

import sample.database.sqlite.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

  List<Customer> findByLastName(String lastName);

  Customer findById(long id);
}