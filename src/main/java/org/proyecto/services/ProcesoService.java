/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.proyecto.services;


import org.proyecto.dto.ProcesoDTO;
import org.proyecto.entity.Proceso;
import org.proyecto.mappers.ProcesoMapper;
import org.proyecto.repositories.ProcesoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @author Erick Bedón
 */
@Service
public class ProcesoService {
    
    @Autowired
    private ProcesoRepository procesoRepository;

    @Autowired
    private ProcesoMapper procesoMapper;
    
    public Proceso saveProceso(Proceso proceso){
        return procesoRepository.save(proceso);
    }
    
    public List<ProcesoDTO> getAllProcesos(){

       List<Proceso> procesos = procesoRepository.findAll();
       List<ProcesoDTO> procesosDTO = procesoMapper.toDto(procesos);

       return procesosDTO;
    }
}
