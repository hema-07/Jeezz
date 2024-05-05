package com.will.amberx.jeezz.pojo;

import jakarta.annotation.Generated;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

/**
 * Seating Details POJO
 * eventId is foreign key here
 */
@Setter
@Getter
@Builder
@Entity
@Table
@AllArgsConstructor
public class SeatingDetails implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long seatingId;

    private String eventCode;

    @Enumerated(EnumType.STRING)
    private EventSeatingCategory category;

    private int numberOfSeats;

    public SeatingDetails(){}
}
