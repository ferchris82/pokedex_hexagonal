package com.chrisferdev.pokedex_hexagonal.domain1.api2;

import com.chrisferdev.pokedex_hexagonal.domain1.model1.Type;

import java.util.List;

public interface ITypeServicePort {
    Type saveType(Type type);
    List<Type> getAllTypes();
    Type getType(Long typeId);
    void updateType(Type type);
    void deleteType(Long typeId);
}
