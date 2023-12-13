package org.proyecto.mappers;


import org.mapstruct.Mapper;
import org.proyecto.dto.ProcesoDTO;
import org.proyecto.entity.Proceso;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProcesoMapper {

    ProcesoDTO toDto(Proceso proceso);

    Proceso toEntity(ProcesoDTO dto);
    List<ProcesoDTO> toDto(List<Proceso>process);
    List<Proceso> toEntity(List<ProcesoDTO> process);
}
