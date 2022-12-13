package org.bedu.apipokemon.service;

import org.bedu.apipokemon.entity.Pokemon;

import java.util.List;

public interface IPokemonService {
    public List<Pokemon> getAll();

    public Pokemon getOneByNumber(int number);

    public Pokemon create(Pokemon pokemon);
}
