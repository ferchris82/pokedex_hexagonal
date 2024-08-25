package com.chrisferdev.pokedex_hexagonal.domain1.api2;
// 2.
// Interfaces donde vamos a exponer los métodos para nuestro dominio

import com.chrisferdev.pokedex_hexagonal.domain1.model1.Pokemon;

import java.util.List;

public interface IPokemonServicePort {

    void savePokemon(Pokemon pokemon);
    List<Pokemon>getAllPokemon();
    Pokemon getPokemon(Long pokemonNumber);
    void updatePokemon(Pokemon pokemon);
    void deletePokemon(Long pokemon);

}
