package org.proyecto.mappers;

import org.mapstruct.Mapper;
import org.proyecto.dto.PersonaDTO;
import org.proyecto.entity.Persona;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PersonaMapper {

    PersonaDTO toDto(Persona persona);

    Persona toEntity(PersonaDTO dto);
    List<PersonaDTO> toDto(List<Persona>personas);
    List<Persona> toEntity(List<PersonaDTO> personas);
}
