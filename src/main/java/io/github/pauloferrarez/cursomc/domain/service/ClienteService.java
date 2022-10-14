package io.github.pauloferrarez.cursomc.domain.service;

import io.github.pauloferrarez.cursomc.application.exception.CustomException;
import io.github.pauloferrarez.cursomc.domain.model.Cliente;
import io.github.pauloferrarez.cursomc.domain.service.abstracts.AbstractService;
import io.github.pauloferrarez.cursomc.persistance.repository.ClienteRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ClienteService extends AbstractService<Cliente, Integer> {

    private ClienteRepository clienteRepository;

    @Override
    public Cliente findById(Integer id) {
        return clienteRepository.findById(id).orElseThrow(() ->
                new CustomException("Cliente não encontrado! Id: " + id, HttpStatus.NOT_FOUND));
    }

    @Override
    public JpaRepository<Cliente, Integer> getRepository() {
        return clienteRepository;
    }
}
