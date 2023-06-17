package mirea.artemtask.Mappers;

import mirea.artemtask.Controllers.dto.FlightDTO;
import mirea.artemtask.Entities.Flight;

import java.util.List;
import java.util.stream.Collectors;

public class FlightMapper {
    public static FlightDTO mapToDTO(Flight flight) {
        FlightDTO flightDTO = new FlightDTO();
        flightDTO.setId(flight.getId());
        flightDTO.setFlightNumber(flight.getFlightNumber());
        flightDTO.setDeparturePoint(flight.getDeparturePoint());
        flightDTO.setDestinationPoint(flight.getDestinationPoint());
        flightDTO.setDepartureTime(flight.getDepartureTime());
        flightDTO.setArrivalTime(flight.getArrivalTime());
        return flightDTO;
    }

    public static List<FlightDTO> mapToDTOList(List<Flight> flights) {
        return flights.stream()
                .map(FlightMapper::mapToDTO)
                .collect(Collectors.toList());
    }

    public static Flight mapToEntity(FlightDTO flightDTO) {
        Flight flight = new Flight();
        flight.setId(flightDTO.getId());
        flight.setFlightNumber(flightDTO.getFlightNumber());
        flight.setDeparturePoint(flightDTO.getDeparturePoint());
        flight.setDestinationPoint(flightDTO.getDestinationPoint());
        flight.setDepartureTime(flightDTO.getDepartureTime());
        flight.setArrivalTime(flightDTO.getArrivalTime());
        return flight;
    }
}
