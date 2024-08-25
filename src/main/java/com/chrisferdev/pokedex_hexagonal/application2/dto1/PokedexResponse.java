package com.chrisferdev.pokedex_hexagonal.application2.dto1;

import lombok.Getter;
import lombok.Setter;

// Dto de respuesta(Response)
@Getter
@Setter
public class PokedexResponse {
    private Long number;
    private String name;
    private TypeDto types;
    private String photo;
}
