package org.proyecto.resource;

import org.proyecto.services.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonResource {

    @Autowired
    private PersonaService personaService;

    @RequestMapping(value = "personas", method = RequestMethod.GET)
    public ResponseEntity<?> getAllPersonas(){
        return new ResponseEntity<>(personaService.getAllPersonas(), HttpStatus.OK);
    }
}
