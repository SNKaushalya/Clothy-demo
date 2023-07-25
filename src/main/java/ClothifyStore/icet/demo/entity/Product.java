package ClothifyStore.icet.demo.entity;

import javax.persistence.*;

@Entity
public class Product { // Corrected the class name to follow Java naming conventions
    @Id
    @Column(nullable = false)
    private Integer id;

    @Column(nullable = false)
    private String name;

    private String description;

    @Column(nullable = false)
    private Double price;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private String size;

    @OneToOne(mappedBy = "product", cascade = CascadeType.ALL)
    private Inventory inventory;

    // Getters and setters (removed for brevity)
}
