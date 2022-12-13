package org.bedu.apipokemon.repository;

import org.bedu.apipokemon.entity.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPokemonRepository extends JpaRepository<Pokemon,Long> {
    Pokemon findOneByNumber(int number);
    List<Pokemon> findAll();
}
