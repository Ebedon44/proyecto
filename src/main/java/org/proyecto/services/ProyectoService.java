/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.proyecto.services;


import org.proyecto.dto.ProyectoDTO;
import org.proyecto.entity.Proyecto;
import org.proyecto.mappers.ProyectoMapper;
import org.proyecto.repositories.ProyectoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProyectoService {

    @Autowired
    private ProyectoRepository proyectoRepository;
    @Autowired
    private ProyectoMapper proyectoMapper;


    public ProyectoDTO saveProyecto(ProyectoDTO dto) {
        Proyecto p = proyectoMapper.toEntity(dto);
        p = proyectoRepository.save(p);
        return proyectoMapper.toDto(p);
    }
    public List<ProyectoDTO> getAllProyectos(){
        List<Proyecto> proyectos = proyectoRepository.findAll();
        List<ProyectoDTO> proyectoDTOS = proyectoMapper.toDto(proyectos);
        return proyectoDTOS;
    }
    public ProyectoDTO updateProyecto(Integer id, ProyectoDTO proyectoDTO) {
        Proyecto p = proyectoMapper.toEntity(proyectoDTO);
        p.setId(id);
        p = proyectoRepository.save(p);
        return proyectoMapper.toDto(p);
    }


    public void deleteProyecto(Integer id){
        proyectoRepository.deleteById(id);
    }

}
