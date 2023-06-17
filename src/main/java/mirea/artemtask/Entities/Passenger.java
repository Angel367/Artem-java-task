package mirea.artemtask.Entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "passengers")
public class Passenger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "passenger_name", nullable = false)
    private String passengerName;

    public Passenger() {
    }

    public Passenger(long id, String passengerName) {
        this.id = id;
        this.passengerName = passengerName;
    }
}
