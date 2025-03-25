package it.uniroma3.ecommerce.ecommerce;


import java.time.LocalDateTime;
import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "order_table")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private LocalDateTime creationTime;

  @OneToMany(mappedBy = "order")
  private List<OrderLine> orderLines;
  @ManyToOne
  private Customer customer;

    public Order(LocalDateTime creationTime) {
        this.creationTime = creationTime;
        
    }
}
