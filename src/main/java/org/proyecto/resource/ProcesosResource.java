package org.proyecto.resource;

import org.proyecto.services.ProcesoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProcesosResource {

    @Autowired
    private ProcesoService procesoService;

    @RequestMapping(value = "procesos", method = RequestMethod.GET)
    public ResponseEntity<?> getAllProcesos(){
        return new ResponseEntity<>(procesoService.getAllProcesos(), HttpStatus.OK);
    }
}
