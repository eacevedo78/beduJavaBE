//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.example.demo.model;

public class Curso {
    private String nombre;
    private Long id;

    public Curso(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public Long getId() {
        return this.id;
    }
}

