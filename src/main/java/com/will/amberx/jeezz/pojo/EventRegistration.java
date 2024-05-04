package com.will.amberx.jeezz.pojo;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Setter
@Getter
public class EventRegistration {

    private String firstName;
    private String lastName;
    private String gender;
    private String age;
    private EventDetails eventDetails;
    private EventSeatingCategory seatingCategory;
}
