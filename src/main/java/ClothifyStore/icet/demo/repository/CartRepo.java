package ClothifyStore.icet.demo.repository;

import ClothifyStore.icet.demo.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepo extends JpaRepository<Cart,Integer> {
}
