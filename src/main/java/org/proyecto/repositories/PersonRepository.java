/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.proyecto.repositories;

import org.proyecto.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Erick Bedón
 */
public interface PersonRepository extends JpaRepository<Persona, Integer>{
    
}
