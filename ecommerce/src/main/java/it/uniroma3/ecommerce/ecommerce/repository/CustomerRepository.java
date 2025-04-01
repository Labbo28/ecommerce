package it.uniroma3.ecommerce.ecommerce.repository;

import org.springframework.data.repository.CrudRepository;

import it.uniroma3.ecommerce.ecommerce.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
    
}