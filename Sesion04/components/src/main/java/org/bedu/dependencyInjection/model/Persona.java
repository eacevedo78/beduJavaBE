package org.bedu.dependencyInjection.model;

import org.springframework.stereotype.Component;


@Component
public class Persona {

    private String nombre;

    public Persona(){}

    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return this.nombre;
    }


    public String greet(String anotherName){
        return "Hello " + anotherName + ", my name is " + this.nombre;
    }

}
