package io.github.pauloferrarez.cursomc.persistance.repository;

import io.github.pauloferrarez.cursomc.domain.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
}
