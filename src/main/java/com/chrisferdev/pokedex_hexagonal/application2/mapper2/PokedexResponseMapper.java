package com.chrisferdev.pokedex_hexagonal.application2.mapper2;

import com.chrisferdev.pokedex_hexagonal.application2.dto1.PokedexResponse;
import com.chrisferdev.pokedex_hexagonal.application2.dto1.TypeDto;
import com.chrisferdev.pokedex_hexagonal.domain1.model1.Photo;
import com.chrisferdev.pokedex_hexagonal.domain1.model1.Pokemon;
import com.chrisferdev.pokedex_hexagonal.domain1.model1.Type;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.Base64;
import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        uses = {TypeDtoMapper.class})
public interface PokedexResponseMapper {

    TypeDtoMapper INSTANCE = Mappers.getMapper(TypeDtoMapper.class);

    @Mapping(target = "types.firstType", source = "typeDto.firstType")
    @Mapping(target = "types.firstType", source = "typeDto.firstType")
    @Mapping(target = "types.firstType", source = "typeDto.firstType")
    PokedexResponse toResponse(Pokemon pokemon, TypeDto typeDto, Photo photo);

    @Named("byteArrayToBase64")
    static String byteArrayToBase64(byte[] byteArrayPhoto){
        return Base64.getEncoder().encodeToString(byteArrayPhoto);
    }

    default List<PokedexResponse> toResponseList(List<Pokemon> pokemonList, List<Type> typeList, List<Photo>photoList){
        return pokemonList.stream()
                .map(pokemon -> {
                    PokedexResponse pokedexResponse = new PokedexResponse();
                    pokedexResponse.setNumber(pokemon.getNumber());
                    pokedexResponse.setName(pokemon.getName());
                    pokedexResponse.setTypes(INSTANCE.toDto(typeList.stream().filter(type -> type.getId().equals(pokemon.getTypeId())).findFirst().orElse(null)));
                    pokedexResponse.setPhoto(byteArrayToBase64(photoList.stream().filter(photo -> photo.getId().equals(pokemon.getPhotoId())).findFirst().orElse(null).getPhoto()));
                    return pokedexResponse;
                }).toList();
        // Video 1:07:45
    }
}
