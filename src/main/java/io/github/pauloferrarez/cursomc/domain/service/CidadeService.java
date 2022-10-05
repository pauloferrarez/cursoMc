package io.github.pauloferrarez.cursomc.domain.service;

import io.github.pauloferrarez.cursomc.application.exception.CustomException;
import io.github.pauloferrarez.cursomc.domain.model.Cidade;
import io.github.pauloferrarez.cursomc.persistance.repository.CidadeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CidadeService {

    private CidadeRepository cidadeRepository;

    public Cidade findById(Integer id){
        return cidadeRepository.findById(id)
                .orElseThrow(() -> new CustomException("Objeto não encontrado! Id: " + id));
    }
}
