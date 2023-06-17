package mirea.artemtask.Controllers;

import mirea.artemtask.Controllers.dto.TicketDTO;
import mirea.artemtask.Services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tickets")
public class TicketsController {
    private final TicketService ticketService;

    @Autowired
    public TicketsController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @GetMapping("/{passengerId}")
    public ResponseEntity<List<TicketDTO>> getPassengerTickets(@PathVariable("passengerId") Long passengerId) {
        List<TicketDTO> tickets = ticketService.getPassengerTickets(passengerId);
        return new ResponseEntity<>(tickets, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<String> purchaseTicket(@RequestBody TicketDTO ticketDTO) {
        try {
            ticketService.purchaseTicket(ticketDTO);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Incorrect passenger and/or flight ids");
        }
        return ResponseEntity.ok("Ticket purchased successfully");
    }

    @DeleteMapping("/{ticketId}")
    public ResponseEntity<String> cancelTicket(@PathVariable("ticketId") Long ticketId) {
        try {
            ticketService.cancelTicket(ticketId);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No ticket with that ID");
        }
        return ResponseEntity.ok("Ticket canceled successfully");
    }
}
