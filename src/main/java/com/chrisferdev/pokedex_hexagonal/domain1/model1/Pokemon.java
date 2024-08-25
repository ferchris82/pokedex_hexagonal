package com.chrisferdev.pokedex_hexagonal.domain1.model1;

import lombok.AllArgsConstructor;
import lombok.Data;
// 1.
@Data
@AllArgsConstructor
public class Pokemon {

    private Long id;
    private Long number;
    private String name;
    private Long TypeId;
    private String photoId;


}
