package ClothifyStore.icet.demo.entity;

import javax.persistence.*;

@Entity
public class CartItem {
    @Id
            @GeneratedValue(strategy = GenerationType.AUTO)
    private
    Integer id;

    @OneToOne
    @JoinColumn(name = "product_id")
    private
    Product product;

    private Integer quantity;
    @ManyToOne
    @JoinColumn(name = "cart_id")
    private
    Cart cart;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ClothifyStore.icet.demo.entity.Product getProduct() {
        return product;
    }

    public void setProduct(ClothifyStore.icet.demo.entity.Product product) {
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }
}
