package com.will.amberx.jeezz.controller;

import com.will.amberx.jeezz.pojo.EventDetails;
import com.will.amberx.jeezz.service.JeezzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * This controller to do CRUS operation related to event details
 * @Author Hemavathi Teamilmaran
 */
@RestController
@RequestMapping("/jeezz")
public class JeezzController {

    @Autowired
    private JeezzService jeezzService;

    /**
     * Get all event details from Event Details Repo
     * @return list pf event details objects
     */
    @GetMapping(path = "/getAllEventDetails", produces = "application/json")
    public ResponseEntity<?> getAllEventDetails() {
        return new ResponseEntity<>(jeezzService.getAllEventDetails(), HttpStatus.OK);
    }

    /**
     * save event details
     * @return saved event details object
     */
    @PostMapping(path = "/saveEventDetails", produces = "application/json")
    public ResponseEntity<?> saveEventDetails() {
        return new ResponseEntity<>(jeezzService.saveEventDetails(), HttpStatus.CREATED);
    }

    /**
     * Get all event details from Event Details Repo
     * @return list pf event details objects
     */
    @GetMapping(path = "/getEventDetails", produces = "application/json")
    public ResponseEntity<?> getAllEventDetailsById(@RequestParam String id) {
        return new ResponseEntity<>(jeezzService.generateJson(id), HttpStatus.OK);
    }

}
