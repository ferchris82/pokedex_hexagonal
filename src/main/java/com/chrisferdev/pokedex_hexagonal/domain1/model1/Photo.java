package com.chrisferdev.pokedex_hexagonal.domain1.model1;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Photo {
    private String id;
    private byte[] photo;
}
