package org.bedu.apipokemon.repository;

import org.bedu.apipokemon.entity.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ITrainerRepository extends JpaRepository<Trainer,Long> {
    Trainer findOneByName(String name);
    List<Trainer> findAll();
}
