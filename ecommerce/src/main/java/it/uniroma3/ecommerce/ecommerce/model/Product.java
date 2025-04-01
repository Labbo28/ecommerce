package it.uniroma3.ecommerce.ecommerce.model;

import java.util.List;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;

@Entity
@Data
public class Product {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  @Column(nullable = false)
  private String name;
  private float price;
  private String description;
  @Column(unique = true, nullable = false)
  private String code;

  @ManyToMany(mappedBy = "products")
  private List<Provider> providers;

public Product() {
}

public Product(String name, float price, String description, String code) {
    this.name = name;
    this.price = price;
    this.description = description;
    this.code = code;
}
}
