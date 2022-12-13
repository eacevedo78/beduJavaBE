package org.bedu.apipokemon.config;

import org.bedu.apipokemon.entity.Pokemon;
import org.bedu.apipokemon.entity.Trainer;
import org.bedu.apipokemon.repository.IPokemonRepository;
import org.bedu.apipokemon.repository.ITrainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Seeder implements CommandLineRunner {
    private IPokemonRepository pokemonRepository;
    private ITrainerRepository trainerRepository;
    @Autowired
    public Seeder(IPokemonRepository pokemonRepository, ITrainerRepository trainerRepository){
        this.pokemonRepository=pokemonRepository;
        this.trainerRepository=trainerRepository;
    }

    @Override
    public void run(String args[]){
        Pokemon existing = pokemonRepository.findOneByNumber(25);
        if(existing == null) {
            Pokemon p1 = new Pokemon();
            p1.setName("Pikachu");
            p1.setNumber(25);
            pokemonRepository.save(p1);
        }
        Trainer ash= trainerRepository.findOneByName("Ash");
        if(ash==null){
            Trainer t= new Trainer();
            t.setName("Ash");
            trainerRepository.save(t);
        }
    }
}
