package mirea.artemtask.Services;

import mirea.artemtask.Controllers.dto.TicketDTO;
import mirea.artemtask.Entities.Flight;
import mirea.artemtask.Entities.Ticket;
import mirea.artemtask.Mappers.TicketMapper;
import mirea.artemtask.Repositories.FlightRepository;
import mirea.artemtask.Repositories.PassengerRepository;
import mirea.artemtask.Repositories.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.dao.EmptyResultDataAccessException;


import java.util.List;

@Service
@Transactional
public class TicketService {
    private final TicketRepository ticketRepository;
    private final PassengerRepository passengerRepository;
    private final FlightRepository flightRepository;

    @Autowired
    public TicketService(TicketRepository ticketRepository, PassengerRepository passengerRepository, FlightRepository flightRepository) {
        this.ticketRepository = ticketRepository;
        this.passengerRepository = passengerRepository;
        this.flightRepository = flightRepository;
    }

    public List<TicketDTO> getPassengerTickets(Long passengerId) {
        List<Ticket> tickets = ticketRepository.findByPassengerId(passengerId);
        return TicketMapper.mapToDTOList(tickets);
    }

    public void purchaseTicket(TicketDTO ticketDTO) {
        Flight flight = flightRepository.findById(ticketDTO.getFlightId())
                .orElseThrow(() -> new RuntimeException("Flight not found with ID: " + ticketDTO.getFlightId()));

        Ticket ticket = new Ticket();
        ticket.setPassenger(passengerRepository.getById(ticketDTO.getPassengerId()));
        ticket.setFlight(flight);

        ticketRepository.save(ticket);
    }

    public void cancelTicket(Long ticketId) {
        try {
            ticketRepository.deleteById(ticketId);
        } catch (EmptyResultDataAccessException ex) {

        }
    }
}
