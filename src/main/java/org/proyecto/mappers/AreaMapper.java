package org.proyecto.mappers;

import org.mapstruct.Mapper;
import org.proyecto.dto.AreaDTO;
import org.proyecto.entity.Area;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AreaMapper {

    AreaDTO toDto(Area area);

    Area toEntity(AreaDTO dto);
    List<AreaDTO> toDto(List<Area>areas);
    List<Area> toEntity(List<AreaDTO> areas);
}
