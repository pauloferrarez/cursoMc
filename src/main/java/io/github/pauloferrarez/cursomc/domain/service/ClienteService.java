package io.github.pauloferrarez.cursomc.domain.service;

import io.github.pauloferrarez.cursomc.persistance.repository.ClienteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ClienteService {

    private ClienteRepository clienteRepository;
}
