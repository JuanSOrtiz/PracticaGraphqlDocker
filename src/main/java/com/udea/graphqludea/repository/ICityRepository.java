package com.udea.graphqludea.repository;

import com.udea.graphqludea.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface ICityRepository extends JpaRepository<City, String> {

    // Método para buscar ciudad por código IATA
    Optional<City> findByIataCode(String iataCode);
}