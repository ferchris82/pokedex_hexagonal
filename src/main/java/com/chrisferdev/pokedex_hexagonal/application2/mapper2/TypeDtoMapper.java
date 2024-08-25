package com.chrisferdev.pokedex_hexagonal.application2.mapper2;

import com.chrisferdev.pokedex_hexagonal.application2.dto1.TypeDto;
import com.chrisferdev.pokedex_hexagonal.domain1.model1.Type;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface TypeDtoMapper {
    TypeDto toDto(Type type);
}
