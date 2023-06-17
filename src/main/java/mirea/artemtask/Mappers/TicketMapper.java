package mirea.artemtask.Mappers;

import mirea.artemtask.Controllers.dto.TicketDTO;
import mirea.artemtask.Entities.Ticket;
import mirea.artemtask.Repositories.FlightRepository;
import mirea.artemtask.Repositories.PassengerRepository;

import java.util.List;
import java.util.stream.Collectors;

public class TicketMapper {
    private static FlightRepository flightRepository;
    private static PassengerRepository passengerRepository;
    public static TicketDTO mapToDTO(Ticket ticket) {
        TicketDTO ticketDTO = new TicketDTO();
        ticketDTO.setId(ticket.getId());
        ticketDTO.setPassengerId(ticket.getPassenger().getId());
        ticketDTO.setFlightId(ticket.getFlight().getId());
        return ticketDTO;
    }

    public static List<TicketDTO> mapToDTOList(List<Ticket> tickets) {
        return tickets.stream()
                .map(TicketMapper::mapToDTO)
                .collect(Collectors.toList());
    }

    public static Ticket mapToEntity(TicketDTO ticketDTO) {
        Ticket ticket = new Ticket();
        ticket.setId(ticketDTO.getId());
        ticket.setFlight(flightRepository.getById(ticketDTO.getFlightId()));
        ticket.setPassenger(passengerRepository.getById(ticketDTO.getPassengerId()));
        return ticket;
    }
}

