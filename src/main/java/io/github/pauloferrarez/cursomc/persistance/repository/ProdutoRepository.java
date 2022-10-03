package io.github.pauloferrarez.cursomc.persistance.repository;

import io.github.pauloferrarez.cursomc.domain.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
}
