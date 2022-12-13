package org.bedu.apipokemon.service;

import org.bedu.apipokemon.entity.Trainer;

import java.util.List;

public interface ITrainerService {
    public List<Trainer> getAll();

    public Trainer getOneByName(String name);
}
