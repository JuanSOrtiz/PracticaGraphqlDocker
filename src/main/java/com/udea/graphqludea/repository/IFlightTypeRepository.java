package com.udea.graphqludea.repository;

import com.udea.graphqludea.entity.FlightType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFlightTypeRepository extends JpaRepository<FlightType, Long> {
    // No es necesario agregar métodos adicionales
}