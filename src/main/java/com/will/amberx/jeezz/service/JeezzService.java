package com.will.amberx.jeezz.service;

import com.will.amberx.jeezz.pojo.EventDetails;

import java.util.List;

/**
 * Main interface
 */
public interface JeezzService {

    List<EventDetails> getAllEventDetails();

    EventDetails saveEventDetails();

    Object generateJson(String id);
}
