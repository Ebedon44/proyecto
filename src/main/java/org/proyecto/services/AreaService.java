/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.proyecto.services;

import org.proyecto.dto.AreaDTO;
import org.proyecto.dto.PersonaDTO;
import org.proyecto.entity.Area;
import org.proyecto.entity.Persona;
import org.proyecto.mappers.AreaMapper;
import org.proyecto.repositories.AreaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 *
 * @author Erick Bedón
 */
@Service
public class AreaService {
    
    @Autowired
    private AreaRepository areaRepository;
    @Autowired
    private AreaMapper areaMapper;
    

    public Area saveArea(Area area){
        return areaRepository.save(area);
    }
    public List<AreaDTO> getAllAreas(){
        List<Area> areas = areaRepository.findAll();
        List<AreaDTO> areaDTOS = areaMapper.toDto(areas);
        return  areaDTOS;
    }
}
