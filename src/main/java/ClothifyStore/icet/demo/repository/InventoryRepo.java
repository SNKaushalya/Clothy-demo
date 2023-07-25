package ClothifyStore.icet.demo.repository;

import ClothifyStore.icet.demo.entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepo extends JpaRepository<Inventory,Integer> {
}
