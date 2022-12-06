//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.example.demo.controller;

import com.example.demo.model.Curso;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/prueba"})
public class PruebaController {
    public PruebaController() {
    }

    @GetMapping({"/hello"})
    public String helloWorld() {
        return "Hola Mundo";
    }

    @GetMapping({"/goodbye"})
    public String goodBye() {
        return "Adios";
    }

    @GetMapping({"/curso"})
    public Curso curso() {
        return new Curso(1L, "Programacion en Ruby");
    }
}

