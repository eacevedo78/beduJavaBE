package org.bedu.dependencyInjection;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.bedu.dependencyInjection.model.Persona;
@SpringBootApplication
public class DependencyInjectionApplication implements CommandLineRunner {
  private Persona persona;

  public DependencyInjectionApplication(Persona persona){
      this.persona=persona;
  }

  public static void main(String[] args){
      SpringApplication.run(DependencyInjectionApplication.class, args);
  }

  @PostConstruct
  public void init(){
    persona.setNombre("Emmanuel");
  }
  @Override
    public void run(String[] args){
      System.out.println(persona.greet("Jimena"));
  }

}
