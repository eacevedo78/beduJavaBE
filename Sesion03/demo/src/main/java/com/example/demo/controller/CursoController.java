//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.example.demo.controller;

import com.example.demo.model.CrearCurso;
import com.example.demo.model.Curso;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CursoController {
    private List<Curso> cursos = new LinkedList();
    private Long ultimoId = 102L;

    public CursoController() {
        this.cursos.add(new Curso(100L, "Java"));
        this.cursos.add(new Curso(101L, "Groovy"));
        this.cursos.add(new Curso(102L, "Ruby"));
    }

    @GetMapping({"/obtenerCursos"})
    public List<Curso> obtenerCursos() {
        return this.cursos;
    }

    @GetMapping({"/obtenerCurso/{id}"})
    public Curso CursoController(@PathVariable Long id) {
        Optional<Curso> curso = this.cursos.stream().filter((c) -> {
            return c.getId() == id;
        }).findAny();
        return (Curso)curso.orElseThrow();
    }

    @PostMapping({"/crearCurso"})
    public Curso crearCurso(@RequestBody CrearCurso data) {
        Curso nuevo = new Curso(this.ultimoId = this.ultimoId + 1L, data.getNombre());
        this.cursos.add(nuevo);
        return nuevo;
    }
}

