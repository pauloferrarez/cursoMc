package io.github.pauloferrarez.cursomc.application.controllers;

import io.github.pauloferrarez.cursomc.domain.model.Categoria;
import io.github.pauloferrarez.cursomc.domain.service.CategoriaService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/categorias")
@AllArgsConstructor
public class CategoriaController {

    private CategoriaService categoriaService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Categoria> findById(@PathVariable Integer id){
        return new ResponseEntity<>(categoriaService.findById(id), HttpStatus.OK);
    }
}
