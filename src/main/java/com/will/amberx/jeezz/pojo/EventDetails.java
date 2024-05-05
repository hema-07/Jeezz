package com.will.amberx.jeezz.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

/**
 * Event Details POJO
 */
@Builder
@Setter
@Getter
@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EventDetails implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @JsonProperty("Event ID")
    private long eventId;

    @JsonProperty("Event Code")
    private String eventCode;

    @JsonProperty("Event Name")
    private String eventName;

    @JsonProperty("Event Description")
    private String eventDescription;

    @JsonProperty("Event Price")
    private double eventPrice;

    @JsonProperty("Event Location")
    private String eventLocation;

    @JsonProperty("Event Theme")
    private String eventTheme;


}
