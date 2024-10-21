package com.udea.graphqludea.service;

import com.udea.graphqludea.entity.City;
import com.udea.graphqludea.repository.ICityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CityService {

    @Autowired
    private ICityRepository cityRepository;

    // Método para buscar una ciudad por su código IATA
    public City getCityByIataCode(String iataCode) {
        return cityRepository.findByIataCode(iataCode)
                .orElseThrow(() -> new RuntimeException("City with IATA code " + iataCode + " not found"));
    }
}