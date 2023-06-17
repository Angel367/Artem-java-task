package mirea.artemtask.Services;

import mirea.artemtask.Controllers.dto.FlightDTO;
import mirea.artemtask.Entities.Flight;
import mirea.artemtask.Mappers.FlightMapper;
import mirea.artemtask.Repositories.FlightRepository;
import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
@Transactional
public class FlightService {
    private final FlightRepository flightRepository;

    @Autowired
    public FlightService(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    public List<FlightDTO> getAllFlights() {
        List<Flight> flights = flightRepository.findAll();
        return FlightMapper.mapToDTOList(flights);
    }

    @PostConstruct
    public void createTestFlights() {
        FlightDTO flightDTO1 = new FlightDTO(
                1L,
                "SU 1759",
                "Волгоград",
                "Москва",
                LocalDateTime.now(),
                LocalDateTime.now().plusHours(4)
        );
        FlightDTO flightDTO2 = new FlightDTO(
                2L,
                "FV 6290",
                "Москва",
                "Магада",
                LocalDateTime.now(),
                LocalDateTime.now().plusHours(2)
        );
        FlightDTO flightDTO3 = new FlightDTO(
                3L,
                "MU 2075",
                "Пекин",
                "Москва",
                LocalDateTime.now(),
                LocalDateTime.now().plusHours(9)
        );
        Flight flight1 = FlightMapper.mapToEntity(flightDTO1);
        flightRepository.save(flight1);
        Flight flight2 = FlightMapper.mapToEntity(flightDTO2);
        flightRepository.save(flight2);
        Flight flight3 = FlightMapper.mapToEntity(flightDTO3);
        flightRepository.save(flight3);
    }
}