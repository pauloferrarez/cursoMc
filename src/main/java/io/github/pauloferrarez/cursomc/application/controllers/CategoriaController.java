package io.github.pauloferrarez.cursomc.application.controllers;

import io.github.pauloferrarez.cursomc.domain.model.Categoria;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaController {

    @GetMapping()
    public List<Categoria> findAll(){

        List<Categoria> categorias = new ArrayList<>();

        categorias.add(new Categoria(1, "Informática"));
        categorias.add(new Categoria(2, "Robótica"));

        return categorias;
    }
}
