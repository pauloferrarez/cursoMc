package io.github.pauloferrarez.cursomc.domain.service;

import io.github.pauloferrarez.cursomc.application.exception.CustomException;
import io.github.pauloferrarez.cursomc.domain.model.Estado;
import io.github.pauloferrarez.cursomc.persistance.repository.EstadoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EstadoService {

    private EstadoRepository estadoRepository;

    public Estado findById(Integer id){
        return estadoRepository.findById(id)
                .orElseThrow(() -> new CustomException("Objeto não encontrado! Id: " + id));
    }
}
