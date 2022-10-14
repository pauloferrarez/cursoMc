package io.github.pauloferrarez.cursomc.domain.service.abstracts;

public interface Service<T, ID> {

    T findById(ID id);

    T save(T obj);

}
