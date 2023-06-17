package mirea.artemtask.Controllers.dto;

public class TicketDTO {
    private Long id;
    private Long passengerId;
    private Long flightId;

    // Constructors, getters, and setters

    public TicketDTO() {}

    public TicketDTO(Long id, Long passengerId, Long flightId) {
        this.id = id;
        this.passengerId = passengerId;
        this.flightId = flightId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(Long passengerId) {
        this.passengerId = passengerId;
    }

    public Long getFlightId() {
        return flightId;
    }

    public void setFlightId(Long flightId) {
        this.flightId = flightId;
    }
}
