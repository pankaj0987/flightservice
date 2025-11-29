package com.fs.flightservice.controller;

import com.fs.flightservice.model.Flight;
import com.fs.flightservice.services.FlightService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/flights")
public class FlightController {

    private final FlightService flightService;

    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }

    @GetMapping("/available")
    public List<Flight> getFlights() {
        return flightService.getAvailableFlights();
    }

    @GetMapping("/{flightNumber}")
    public Flight getFlightByNumber(@PathVariable String flightNumber) {
        return flightService.getFlightByNumber(flightNumber);
    }
}
