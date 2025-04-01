package it.uniroma3.ecommerce.ecommerce.model;

import jakarta.persistence.GeneratedValue;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;



@Entity
@Data
@NoArgsConstructor
@Table(uniqueConstraints=@UniqueConstraint(columnNames={"firstname","lastname,dateOfBirth"}))
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;
    private String email;
    private String phoneNumber;
    private LocalDate dateOfBirth;
    private LocalDateTime registrationDate;
   
    @ToString.Exclude
    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, fetch = FetchType.LAZY)
    @JoinColumn(name = "adress_id")
    private Adress adress;
    
    @OneToMany(mappedBy = "customer")
    
    private List<Order> orders;

    public Customer(String firstName, String lastName, String email, String phoneNumber, LocalDate dateOfBirth, LocalDateTime registrationDate, Adress adress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
        this.registrationDate = registrationDate;
        this.adress = adress;
    
    }
}
