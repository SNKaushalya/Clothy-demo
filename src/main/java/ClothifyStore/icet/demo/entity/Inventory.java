package ClothifyStore.icet.demo.entity;

import javax.persistence.*;

@Entity
public class Inventory  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private int quantity;

    // Other attributes, getters, setters, constructors, etc.

    @OneToOne
    @JoinColumn(name = "product_id")
    private Product product;
}
