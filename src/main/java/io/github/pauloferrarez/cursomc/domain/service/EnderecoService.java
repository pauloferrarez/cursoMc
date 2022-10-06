package io.github.pauloferrarez.cursomc.domain.service;

import io.github.pauloferrarez.cursomc.persistance.repository.EnderecoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EnderecoService {

    private EnderecoRepository enderecoRepository;
}
