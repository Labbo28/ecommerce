 package it.uniroma3.ecommerce.ecommerce.repository;
import org.springframework.data.repository.CrudRepository;
import it.uniroma3.ecommerce.ecommerce.model.Adress;

public interface AdressRepository extends CrudRepository<Adress, Long> {
    // This interface will automatically provide CRUD operations for the Adress entity
    // No additional methods are needed unless you want to add custom queries

     
}