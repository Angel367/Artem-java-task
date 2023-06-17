package mirea.artemtask.Controllers.dto;

import java.time.LocalDateTime;

public class FlightDTO {
    private Long id;
    private String flightNumber;
    private String departurePoint;
    private String destinationPoint;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;

    public FlightDTO() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDeparturePoint() {
        return departurePoint;
    }

    public void setDeparturePoint(String departurePoint) {
        this.departurePoint = departurePoint;
    }

    public String getDestinationPoint() {
        return destinationPoint;
    }

    public void setDestinationPoint(String destinationPoint) {
        this.destinationPoint = destinationPoint;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(LocalDateTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public FlightDTO(Long id, String flightNumber, String departurePoint, String destinationPoint,
                     LocalDateTime departureTime, LocalDateTime arrivalTime) {
        this.id = id;
        this.flightNumber = flightNumber;
        this.departurePoint = departurePoint;
        this.destinationPoint = destinationPoint;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }
}
