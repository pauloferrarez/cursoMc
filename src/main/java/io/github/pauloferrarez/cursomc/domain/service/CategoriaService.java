package io.github.pauloferrarez.cursomc.domain.service;

import io.github.pauloferrarez.cursomc.application.exception.CustomException;
import io.github.pauloferrarez.cursomc.domain.model.Categoria;
import io.github.pauloferrarez.cursomc.domain.service.abstracts.AbstractService;
import io.github.pauloferrarez.cursomc.persistance.repository.CategoriaRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CategoriaService extends AbstractService<Categoria, Integer> {

    private final CategoriaRepository categoriaRepository;

    @Override
    public Categoria findById(Integer id){
        return categoriaRepository.findById(id)
                .orElseThrow(() -> new CustomException("Objeto não encontrado! Id: " + id, HttpStatus.NOT_FOUND));
    }

    @Override
    public JpaRepository<Categoria, Integer> getRepository() {
        return categoriaRepository;
    }
}
