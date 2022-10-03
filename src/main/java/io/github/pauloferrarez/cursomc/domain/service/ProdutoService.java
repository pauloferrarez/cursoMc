package io.github.pauloferrarez.cursomc.domain.service;

import io.github.pauloferrarez.cursomc.domain.model.Produto;
import io.github.pauloferrarez.cursomc.persistance.repository.ProdutoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProdutoService {

    private ProdutoRepository produtoRepository;

    public Produto findById(Integer id){
        return produtoRepository.findById(id)
                .orElse(null);
    }
}
