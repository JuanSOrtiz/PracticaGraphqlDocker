package com.udea.graphqludea.controller;

import org.springframework.beans.factory.annotation.Autowired;
import com.udea.graphqludea.entity.AirplaneType;
import com.udea.graphqludea.service.AirplaneTypeService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import java.util.List;

@Controller
public class AirplaneTypeController {

    @Autowired
    private AirplaneTypeService airplaneTypeService;

    @QueryMapping
    public List<AirplaneType> getAllAirplaneTypes() {
        return airplaneTypeService.getAllAirplaneTypes();
    }

    @QueryMapping
    public AirplaneType getAirplaneTypeById(@Argument Long id) {
        return airplaneTypeService.getAirplaneTypeById(id);
    }
}