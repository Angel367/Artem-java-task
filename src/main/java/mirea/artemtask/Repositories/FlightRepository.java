package mirea.artemtask.Repositories;

import mirea.artemtask.Entities.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {
    @Override
    Flight getById(Long aLong);
}
