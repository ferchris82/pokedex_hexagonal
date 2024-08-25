package com.chrisferdev.pokedex_hexagonal.application2.dto1;

import com.chrisferdev.pokedex_hexagonal.domain1.model1.Type;
import lombok.Getter;
import lombok.Setter;

// Dto de comando(request)
@Getter
@Setter
public class PokedexRequest {
    private Long number;
    private String name;
    private Type types;
    private String photo;
}
