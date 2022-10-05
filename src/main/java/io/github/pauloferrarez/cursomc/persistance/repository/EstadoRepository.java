package io.github.pauloferrarez.cursomc.persistance.repository;

import io.github.pauloferrarez.cursomc.domain.model.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {
}
