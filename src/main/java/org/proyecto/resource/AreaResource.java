package org.proyecto.resource;

import org.proyecto.services.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AreaResource {

    @Autowired
    private AreaService areaService;

    @RequestMapping(value = "areas", method = RequestMethod.GET)
    public ResponseEntity<?> getAllAreas(){
        return  new ResponseEntity<>(areaService.getAllAreas(), HttpStatus.OK);

    }
}




