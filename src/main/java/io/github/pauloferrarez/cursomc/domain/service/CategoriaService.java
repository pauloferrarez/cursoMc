package io.github.pauloferrarez.cursomc.domain.service;

import io.github.pauloferrarez.cursomc.application.exception.CustomException;
import io.github.pauloferrarez.cursomc.domain.model.Categoria;
import io.github.pauloferrarez.cursomc.persistance.repository.CategoriaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CategoriaService{

    private CategoriaRepository categoriaRepository;

    public Categoria findById(Integer id){
        return categoriaRepository.findById(id)
                .orElseThrow(() -> new CustomException("Objeto não encontrado! Id: " + id));
    }
}
