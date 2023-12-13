package org.proyecto.mappers;

import org.mapstruct.Mapper;
import org.proyecto.dto.ProyectoDTO;
import org.proyecto.entity.Proyecto;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProyectoMapper {

    ProyectoDTO toDto(Proyecto proyecto);

    Proyecto toEntity(ProyectoDTO dto);

    List<ProyectoDTO> toDto(List<Proyecto>proyectos);

    List<Proyecto> toEntity(List<ProyectoDTO>proyectos);
}
