package com.udea.graphqludea.controller;

import com.udea.graphqludea.entity.Flight;
import com.udea.graphqludea.service.FlightService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Optional;


import java.util.List;

@Controller
public class FlightController {

    @Autowired
    private FlightService flightService;

    @QueryMapping
    public Optional<Flight> getFlightById(@Argument Long id) {
        return flightService.getFlightById(id);
    }

    @QueryMapping
    public List<Flight> getAllFlights() {
        return flightService.getAllFlights();
    }
}