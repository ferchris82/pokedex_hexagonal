package com.chrisferdev.pokedex_hexagonal.application2.mapper2;

import com.chrisferdev.pokedex_hexagonal.application2.dto1.PokedexRequest;
import com.chrisferdev.pokedex_hexagonal.domain1.model1.Photo;
import com.chrisferdev.pokedex_hexagonal.domain1.model1.Pokemon;
import com.chrisferdev.pokedex_hexagonal.domain1.model1.Type;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.ReportingPolicy;

import java.util.Base64;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface PokedexRequestMapper {
    Pokemon toPokemon(PokedexRequest pokedexRequest);

    @Mapping(source = "pokedexRequest.types.firstType", target = "firstType")
    @Mapping(source = "pokedexRequest.types.secondType", target = "secondType")
    Type toType(PokedexRequest pokedexRequest);

    @Mapping(target = "photo", qualifiedByName = "base64ToByteArray")
    Photo toPhoto(PokedexRequest pokedexRequest);

    @Named("base64ToByteArray")
    static byte[]base64ToByteArray(String base64Photo){
        return Base64.getDecoder().decode(base64Photo);
    }
}
