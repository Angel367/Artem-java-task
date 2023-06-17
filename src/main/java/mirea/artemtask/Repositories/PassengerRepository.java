package mirea.artemtask.Repositories;

import mirea.artemtask.Entities.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassengerRepository extends JpaRepository<Passenger, Long> {
    @Override
    Passenger getById(Long aLong);
}
