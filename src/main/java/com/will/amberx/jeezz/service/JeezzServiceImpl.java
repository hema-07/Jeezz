package com.will.amberx.jeezz.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.will.amberx.jeezz.pojo.EventDetails;
import com.will.amberx.jeezz.pojo.EventRegistration;
import com.will.amberx.jeezz.pojo.EventSeatingCategory;
import com.will.amberx.jeezz.pojo.SeatingDetails;
import com.will.amberx.jeezz.repository.EventDetailsRepository;
import com.will.amberx.jeezz.repository.SeatingDetailsRepository;
import com.will.amberx.jeezz.util.JeezzUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Service class that has all importannt functionalities
 */
@Service
public class JeezzServiceImpl implements JeezzService {

    @Autowired
    private EventDetailsRepository repo;

    @Autowired
    private SeatingDetailsRepository seatingDetailsRepository;

    @Override
    public List<EventDetails> getAllEventDetails() {
        return repo.findAll();
    }

    @Override
    public EventDetails saveEventDetails() {
        SeatingDetails seatingDetails1 = SeatingDetails.builder()
                .category(EventSeatingCategory.Alien)
                .eventCode("ANCH01")
                .numberOfSeats(20)
                .build();
        SeatingDetails seatingDetails2 = SeatingDetails.builder()
                .category(EventSeatingCategory.Ape)
                .eventCode("ANCH01")
                .numberOfSeats(10)
                .build();
        SeatingDetails seatingDetails3 = SeatingDetails.builder()
                .category(EventSeatingCategory.Human)
                .eventCode("ANCH01")
                .numberOfSeats(40)
                .build();
        EventDetails eventDetails = EventDetails.builder()
                .eventName("Animals")
                .eventCode("ANCH01")
                .eventTheme("Wild")
                .eventPrice(1200.00)
                .eventLocation("Chennai")
                .eventDescription("wild themed dance party in chennai")
                .build();
        try {
            repo.save(eventDetails);
            repo.save(eventDetails);
            seatingDetailsRepository.save(seatingDetails1);
            seatingDetailsRepository.save(seatingDetails2);
            seatingDetailsRepository.save(seatingDetails3);
        } catch (Exception e) {
            System.out.println("Error Message :"+e.getMessage());
        }
        return eventDetails;
    }

    public String generateJson(String id) {
        List<String> filteredEventDetails = repo.getFilteredEventDetails(id);
        ObjectMapper mapper = new ObjectMapper();
        List<EventRegistration> list = new ArrayList<>();
        for(String  s: filteredEventDetails) {
            String[] array = s.split(",");
            EventRegistration eventRegistration = EventRegistration.builder()
                    .eventId(Long.parseLong(array[0]))
                    .eventName(array[1])
                    .eventCode(array[2])
                    .eventDescription(array[3])
                    .eventPrice(Double.parseDouble(array[4]))
                    .eventLocation(array[5])
                    .eventTheme(array[6])
                    .category(EventSeatingCategory.valueOf(array[7]))
                    .numberOfSeats(Integer.parseInt(array[8]))
                    .build();
            list.add(eventRegistration);
        }
            try {
                return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(list);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }

        return "Issue occurred";
    }


}
