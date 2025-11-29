package com.fs.flightservice.services;

import com.fs.flightservice.model.Flight;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class FlightService {

    // Mock data using LocalDateTime
    private final List<Flight> flights = List.of(
        new Flight("AI-101", "Air India", "DEL", "MUM",
                LocalDateTime.of(2025, 11, 22, 10, 0),
                LocalDateTime.of(2025, 11, 22, 12, 0),
                42, 5500.0),

        new Flight("6E-501", "IndiGo", "DEL", "BLR",
                LocalDateTime.of(2025, 11, 22, 15, 0),
                LocalDateTime.of(2025, 11, 22, 17, 30),
                21, 6800.0),

        new Flight("SG-909", "SpiceJet", "MUM", "HYD",
                LocalDateTime.of(2025, 11, 22, 9, 30),
                LocalDateTime.of(2025, 11, 22, 11, 0),
                12, 4500.0)
    );

    public List<Flight> getAvailableFlights() {
        return flights;
    }

    public Flight getFlightByNumber(String flightNumber) {
        return flights.stream()
                .filter(f -> f.getFlightNumber().equalsIgnoreCase(flightNumber))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Flight not found: " + flightNumber));
    }
}
