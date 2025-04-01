package it.uniroma3.ecommerce.ecommerce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import it.uniroma3.ecommerce.ecommerce.repository.AdressRepository;
import it.uniroma3.ecommerce.ecommerce.model.Customer;
import it.uniroma3.ecommerce.ecommerce.repository.CustomerRepository;
import jakarta.transaction.Transactional;
import it.uniroma3.ecommerce.ecommerce.model.Adress;

@SpringBootApplication
public class EcommerceApplication implements CommandLineRunner {
  @Autowired
  private CustomerRepository customerRepository;
  @Autowired
	private AdressRepository adressRepository;
;	public static void main(String[] args) {
		SpringApplication.run(EcommerceApplication.class, args);
	}

	private void printCrap() {

		System.out.println("=============================================================================================================================");
	}

	@Transactional
	@Override
	public void run(String... args) throws Exception {

		printCrap();
		for (Customer customer : customerRepository.findAll()) {
			System.out.println("Customer: " + customer);
		}
		printCrap();
		/* 
		Customer customer = new Customer();
		customer.setFirstName("John");
		customer.setLastName("Doe");
		Adress address = new Adress();
		address.setStreet("Via paperino 14");
		customer.setAdress(address);

		printCrap();
		// Print customer details
		System.out.println("Customer before saving: " + customer);
		System.out.println("Address before saving: " + address);
printCrap();
		// Save customer to the database
		customerRepository.save(customer);
		adressRepository.save(address);

printCrap();		// Print customer details again
		System.out.println("Customer after saving: " + customer);
		System.out.println("Address after saving: " + address);
printCrap();
		


	
*/
	}
}
