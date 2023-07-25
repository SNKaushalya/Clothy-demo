package ClothifyStore.icet.demo.repository;

import ClothifyStore.icet.demo.entity.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItempRepo extends JpaRepository<CartItem,Integer> {
}
