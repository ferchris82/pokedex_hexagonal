package com.chrisferdev.pokedex_hexagonal.domain1.spi3;

import com.chrisferdev.pokedex_hexagonal.domain1.model1.Pokemon;

import java.util.List;

// # 3.
// Puerto encargado de comunicarse por el lado de la persistencia
// Extiende las capacidades de nuestro sistema.

public interface IPokemonPersitencePort {
    void savePokemon(Pokemon pokemon);
    List<Pokemon> getAllPokemon();
    Pokemon getPokemon(Long pokemonNumber);
    void updatePokemon(Pokemon pokemon);
    void deletePokemon(Long pokemonNumber);
}
