package com.will.amberx.jeezz.pojo;

import lombok.*;

/**
 * Event Registration POJO
 */
@Builder
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class EventRegistration {

    private long eventId;

    private String eventCode;

    private String eventName;

    private String eventDescription;

    private double eventPrice;

    private String eventLocation;

    private String eventTheme;

    private EventSeatingCategory category;

    private int numberOfSeats;
}
