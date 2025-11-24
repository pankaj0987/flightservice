package com.fs.flightservice.services;

import com.fs.flightservice.model.Flight;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FlightService {

    public List<Flight> getAvailableFlights() {
        return List.of(
            new Flight("AI-101", "Air India", "DEL", "MUM",
                    "2025-11-22 10:00", "2025-11-22 12:00", 42, 5500.0),

            new Flight("6E-501", "IndiGo", "DEL", "BLR",
                    "2025-11-22 15:00", "2025-11-22 17:30", 21, 6800.0),

            new Flight("SG-909", "SpiceJet", "MUM", "HYD",
                    "2025-11-22 09:30", "2025-11-22 11:00", 12, 4500.0)
        );
    }
}
