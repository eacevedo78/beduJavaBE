package org.bedu.apipokemon.service;

import org.bedu.apipokemon.entity.Trainer;
import org.bedu.apipokemon.repository.ITrainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainerServiceImpl implements ITrainerService{
    private ITrainerRepository repository;
    @Autowired
    public TrainerServiceImpl(ITrainerRepository repository){
        this.repository=repository;
    }
    @Override
    public List<Trainer> getAll(){
        return repository.findAll();
    }

    @Override
    public Trainer getOneByName(String name){
        return repository.findOneByName(name);
    }
}
