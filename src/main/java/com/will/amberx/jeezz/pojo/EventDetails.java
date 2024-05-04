package com.will.amberx.jeezz.pojo;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Builder
@Setter
@Getter
public class EventDetails {

    private String eventId;
    private String eventName;
    private String eventDescription;
    private float eventPrice;
    private String eventLocation;
    private String eventTheme;
    private Map<EventSeatingCategory, Integer> eventCapacity;

}
