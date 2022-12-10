package org.bedu.jpa.config;

import org.bedu.jpa.repository.IPersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.bedu.jpa.model.Person;
@Component
public class Seeder implements CommandLineRunner {
    private IPersonRepository repository;
    @Autowired
    public Seeder(IPersonRepository repository){
        this.repository=repository;
    }
    @Override
    public void run(String args[]){
        Person p1 = new Person();
        p1.setName("Emmanuel");
        p1.setLastName("Acevedo");
        p1.setAge(43);

        Person p2= new Person();
        p2.setName("Julieta");
        p2.setLastName("Ramirez");
        p2.setAge(45);

        repository.save(p1);
        repository.save(p2);
    }
}
