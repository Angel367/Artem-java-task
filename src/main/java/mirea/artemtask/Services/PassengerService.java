package mirea.artemtask.Services;

import mirea.artemtask.Controllers.dto.FlightDTO;
import mirea.artemtask.Controllers.dto.PassengerDTO;
import mirea.artemtask.Entities.Flight;
import mirea.artemtask.Entities.Passenger;
import mirea.artemtask.Mappers.FlightMapper;
import mirea.artemtask.Repositories.FlightRepository;
import java.time.LocalDateTime;

import mirea.artemtask.Repositories.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
@Transactional
public class PassengerService {
    private final PassengerRepository passengerRepository;

    @Autowired
    public PassengerService(PassengerRepository passengerRepository) {
        this.passengerRepository = passengerRepository;
    }

    @PostConstruct
    public void createTestFlights() {
        Passenger passenger1 = new Passenger(
                1L,
                "Иванов Иван Иванович"
        );
        Passenger passenger2 = new Passenger(
                2L,
                "Артемов Артем Артемович"
        );
        Passenger passenger3 = new Passenger(
                3L,
                "Егоров Егор Егорович"
        );
        passengerRepository.save(passenger1);
        passengerRepository.save(passenger2);
        passengerRepository.save(passenger3);
    }
}