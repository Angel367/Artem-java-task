package mirea.artemtask.Repositories;

import mirea.artemtask.Entities.Dish;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DishRepository extends JpaRepository<Dish, Long> {
    // Add any custom query methods if needed
}
