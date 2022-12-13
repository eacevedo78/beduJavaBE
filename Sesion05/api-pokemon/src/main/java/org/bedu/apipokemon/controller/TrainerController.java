package org.bedu.apipokemon.controller;

import org.bedu.apipokemon.entity.Trainer;
import org.bedu.apipokemon.service.ITrainerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TrainerController {
    private ITrainerService service;

    public TrainerController(ITrainerService service){
        this.service=service;
    }
    @GetMapping("/getAllTrainer")
    public List<Trainer> getAll(){
        return this.service.getAll();
    }

    @GetMapping("/getOneTrainer/{name}")
    public Trainer getOneByNumber(@PathVariable("name") String name){
        return this.service.getOneByName(name);
    }
}
