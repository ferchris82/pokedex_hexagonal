package com.chrisferdev.pokedex_hexagonal.domain1.model1;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Type {
    private Long id;
    private String firstType;
    private String secondType;
}
