package com.udea.graphqludea.repository;

import com.udea.graphqludea.entity.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStatusRepository extends JpaRepository<Status, Long> {
    // No es necesario agregar métodos adicionales
}