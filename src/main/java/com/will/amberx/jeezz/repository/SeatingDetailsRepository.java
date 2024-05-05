package com.will.amberx.jeezz.repository;

import com.will.amberx.jeezz.pojo.EventSeatingCategory;
import com.will.amberx.jeezz.pojo.SeatingDetails;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Seating details Repository
 */
@Repository
@Transactional
public interface SeatingDetailsRepository extends CrudRepository<SeatingDetails, Long> {


}
