package com.will.amberx.jeezz.repository;

import com.will.amberx.jeezz.pojo.EventDetails;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Event Details Repository
 */
@Repository
@Transactional
public interface EventDetailsRepository extends CrudRepository<EventDetails, Long> {

    List<EventDetails> findAll();

    EventDetails save(EventDetails eventDetails);

    @Query(value = "SELECT e.EVENT_ID , e.Event_Name,e.Event_Code, e.Event_Description,e.Event_Price,e.Event_Location, e.Event_Theme, s.Category,s.Number_Of_Seats, s.SEATING_ID  FROM Event_Details e INNER JOIN Seating_Details s ON e.EVENT_CODE=?1 AND s.EVENT_CODE =?1", nativeQuery = true)
    List<String> getFilteredEventDetails(String id);
}
