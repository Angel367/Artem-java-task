package mirea.artemtask.Controllers.dto;

public class PassengerDTO {
    private long id;

    private String passengerName;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }
    public PassengerDTO(){}

    public PassengerDTO(long id, String passengerName) {
        this.id = id;
        this.passengerName = passengerName;
    }
}
