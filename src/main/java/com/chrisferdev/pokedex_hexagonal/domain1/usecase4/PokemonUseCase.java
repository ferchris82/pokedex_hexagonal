package com.chrisferdev.pokedex_hexagonal.domain1.usecase4;

// # 4
// Los casos de uso dentro del dominio implementan las apis que se encuentran en el dominio
// y van hacer utilizados por los elementos externos
// Aqui no podemos hacer uso de Spring
// Aqui reglas de negocio


import com.chrisferdev.pokedex_hexagonal.domain1.api2.IPokemonServicePort;
import com.chrisferdev.pokedex_hexagonal.domain1.model1.Pokemon;
import com.chrisferdev.pokedex_hexagonal.domain1.spi3.IPokemonPersitencePort;

import java.util.List;

public class PokemonUseCase implements IPokemonServicePort {

    private final IPokemonPersitencePort pokemonPersitencePort;

    // Inyección de dependencias a través de constructor
    public PokemonUseCase(IPokemonPersitencePort iPokemonPersitencePort) {
        this.pokemonPersitencePort = iPokemonPersitencePort;
    }

    @Override
    public void savePokemon(Pokemon pokemon) {
        pokemonPersitencePort.savePokemon(pokemon);
    }

    @Override
    public List<Pokemon> getAllPokemon() {
        return pokemonPersitencePort.getAllPokemon();
    }

    @Override
    public Pokemon getPokemon(Long pokemonNumber) {
        return pokemonPersitencePort.getPokemon(pokemonNumber);
    }

    @Override
    public void updatePokemon(Pokemon pokemon) {
        pokemonPersitencePort.updatePokemon(pokemon);
    }

    @Override
    public void deletePokemon(Long pokemonNumber) {
        pokemonPersitencePort.deletePokemon(pokemonNumber);
    }
}
