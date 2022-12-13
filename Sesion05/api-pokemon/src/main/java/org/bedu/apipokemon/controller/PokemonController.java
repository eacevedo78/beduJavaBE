package org.bedu.apipokemon.controller;

import org.bedu.apipokemon.entity.Pokemon;
import org.bedu.apipokemon.service.IPokemonService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PokemonController {
    private IPokemonService service;

    public PokemonController(IPokemonService service){
        this.service=service;
    }
    @GetMapping("/pokemon")
    @ResponseStatus(HttpStatus.OK)
    public List<Pokemon> getAll(){
        return this.service.getAll();
    }

    @GetMapping("/getOnePokemon/{number}")
    public Pokemon getOneByNumber(@PathVariable("number") int number){
        return this.service.getOneByNumber(number);
    }

    @PostMapping("/pokemon")
    @ResponseStatus(HttpStatus.CREATED)
    public Pokemon create(@RequestBody Pokemon pokemon){
        return service.create(pokemon);
    }
}
