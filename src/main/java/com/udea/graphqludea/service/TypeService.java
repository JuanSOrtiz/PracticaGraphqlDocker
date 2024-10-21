package com.udea.graphqludea.service;

import com.udea.graphqludea.entity.Type;
import com.udea.graphqludea.repository.ITypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;
import java.util.*;

@Service
public class TypeService {

    @Autowired
    private ITypeRepository typeRepository;

    // Método para obtener un Type por su ID
    public Type getTypeById(Long id) {
        Optional<Type> typeOpt = typeRepository.findById(id);
        return typeOpt.orElse(null); // Retorna null si no se encuentra
    }

    // Método para listar todos los tipos (opcional)
    public List<Type> getAllTypes() {
        return typeRepository.findAll();
    }
}