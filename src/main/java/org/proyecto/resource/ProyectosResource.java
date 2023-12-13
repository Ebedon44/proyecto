package org.proyecto.resource;

import org.proyecto.dto.ProyectoDTO;
import org.proyecto.services.ProyectoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProyectosResource {

    @Autowired
    private ProyectoService proyectoService;

    @RequestMapping(value = "proyectos", method = RequestMethod.GET)
    public ResponseEntity<?> getAllProyectos(){
        return new ResponseEntity<>(proyectoService.getAllProyectos(), HttpStatus.OK);
    }

    @RequestMapping(value = "proyecto", method = RequestMethod.POST)
    public ResponseEntity<?> saveProyecto(@RequestBody ProyectoDTO dto){
        return new ResponseEntity<>(proyectoService.saveProyecto(dto),HttpStatus.OK);
    }

    @RequestMapping(value = "proyecto/{id}",method = RequestMethod.PUT)
    public ResponseEntity<?> updateProyecto(@PathVariable Integer id, @Validated @RequestBody ProyectoDTO dto){
        return new ResponseEntity<>(proyectoService.updateProyecto(id,dto), HttpStatus.OK);
    }

    @RequestMapping(value = "proyecto/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteProyecto(@PathVariable Integer id){
        proyectoService.deleteProyecto(id);
        return  new ResponseEntity<>(HttpStatus.OK);
    }


}
