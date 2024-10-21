package com.udea.graphqludea.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.udea.graphqludea.entity.AirplaneType;
@Repository
public interface IAirplaneTypeRepository extends JpaRepository<AirplaneType, Long> {
}