package com.udea.graphqludea.repository;

import com.udea.graphqludea.entity.Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITypeRepository extends JpaRepository<Type, Long> {
    // No es necesario agregar métodos adicionales
}