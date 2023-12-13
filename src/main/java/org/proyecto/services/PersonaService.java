/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.proyecto.services;


import org.proyecto.dto.PersonaDTO;
import org.proyecto.entity.Persona;
import org.proyecto.mappers.PersonaMapper;
import org.proyecto.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Erick Bedón
 */
@Service
public class PersonaService {
    
    @Autowired
    private PersonRepository personaRepository;
    @Autowired
    private PersonaMapper personaMapper;
    
    public Persona savePersona(Persona persona){
        return personaRepository.save(persona);
    }
    
    public List<PersonaDTO> getAllPersonas(){
        List<Persona> personas = personaRepository.findAll();
        List<PersonaDTO> personaDTOS = personaMapper.toDto(personas);
        return personaDTOS;
    }
}
