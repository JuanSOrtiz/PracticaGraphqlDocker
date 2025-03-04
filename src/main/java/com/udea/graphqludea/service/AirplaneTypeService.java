package com.udea.graphqludea.service;

import com.udea.graphqludea.entity.AirplaneType;
import com.udea.graphqludea.repository.IAirplaneTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class AirplaneTypeService {

    @Autowired
    private IAirplaneTypeRepository airplaneRepository;

    // Método para obtener todos los tipos de avión
    public List<AirplaneType> getAllAirplaneTypes() {
        return airplaneRepository.findAll();
    }

    // Método para obtener un tipo de avión por su ID
    public AirplaneType getAirplaneTypeById(Long id) {
        Optional<AirplaneType> airplaneTypeOpt = airplaneRepository.findById(id);
        return airplaneTypeOpt.orElseThrow(() -> new RuntimeException("Airplane Type not found with id: " + id));
    }

    // Método para crear o actualizar un tipo de avión
    public AirplaneType createOrUpdateAirplaneType(AirplaneType airplaneType) {
        return airplaneRepository.save(airplaneType);
    }

    // Método para eliminar un tipo de avión por su ID
    public void deleteAirplaneType(Long id) {
        // Manejo de error: verificar si existe antes de eliminar
        if (!airplaneRepository.existsById(id)) {
            throw new RuntimeException("Cannot delete Airplane Type. Not found with id: " + id);
        }
        airplaneRepository.deleteById(id);
    }
}