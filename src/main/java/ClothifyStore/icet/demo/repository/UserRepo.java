package ClothifyStore.icet.demo.repository;

import ClothifyStore.icet.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {
}
