package org.bedu.apipokemon.service;

import org.bedu.apipokemon.entity.Pokemon;
import org.bedu.apipokemon.repository.IPokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PokemonServiceImpl implements IPokemonService {
    private IPokemonRepository repository;
    @Autowired
    public PokemonServiceImpl(IPokemonRepository repository){
        this.repository=repository;
    }
    @Override
    public List<Pokemon> getAll(){
        return repository.findAll();
    }

    @Override
    public Pokemon getOneByNumber(int number){
        return repository.findOneByNumber(number);
    }
}
