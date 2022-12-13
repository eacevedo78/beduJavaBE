package org.bedu.apipokemon.controller;

import org.bedu.apipokemon.entity.Pokemon;
import org.bedu.apipokemon.service.IPokemonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PokemonController {
    private IPokemonService service;

    public PokemonController(IPokemonService service){
        this.service=service;
    }
    @GetMapping("/getAllPokemon")
    public List<Pokemon> getAll(){
        return this.service.getAll();
    }

    @GetMapping("/getOnePokemon/{number}")
    public Pokemon getOneByNumber(@PathVariable("number") int number){
        return this.service.getOneByNumber(number);
    }
}
