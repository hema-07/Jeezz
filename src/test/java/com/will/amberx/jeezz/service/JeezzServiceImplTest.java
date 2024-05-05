package com.will.amberx.jeezz.service;

import com.will.amberx.jeezz.pojo.EventDetails;
import com.will.amberx.jeezz.pojo.EventSeatingCategory;
import com.will.amberx.jeezz.pojo.SeatingDetails;
import com.will.amberx.jeezz.repository.EventDetailsRepository;
import com.will.amberx.jeezz.repository.SeatingDetailsRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

@SpringBootTest
public class JeezzServiceImplTest {

    @Autowired
    EventDetailsRepository repository;
    @Autowired
    private SeatingDetailsRepository seatingDetailsRepository;
    @Test
    public void getAllEventDetails() {
        JeezzServiceImpl jeezzServiceImpl = new JeezzServiceImpl();
        SeatingDetails seatingDetails = SeatingDetails.builder()
                .category(EventSeatingCategory.Alien)
                .numberOfSeats(20)
                .build();
        List<SeatingDetails> seats = new ArrayList<>();
        seats.add(seatingDetails);
        EventDetails eventDetails = EventDetails.builder()
                .eventName("Animals")
                .eventTheme("Wild")
                .eventPrice(1200.00)
                .eventLocation("Chennai")
                .eventDescription("wild themed dance party in chennai")
                .build();
        Mockito.when(repository.findAll()).thenReturn(Collections.singletonList(eventDetails));
        List<EventDetails> allEventDetails = jeezzServiceImpl.getAllEventDetails();
        Assertions.assertEquals(1, allEventDetails.size());
    }
}