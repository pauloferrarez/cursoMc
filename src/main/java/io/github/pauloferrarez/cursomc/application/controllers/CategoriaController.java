package io.github.pauloferrarez.cursomc.application.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaController {

    @GetMapping()
    public String findAll(){
        return "ta fununfano";
    }
}
