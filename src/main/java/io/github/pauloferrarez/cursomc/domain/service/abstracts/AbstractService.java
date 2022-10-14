package io.github.pauloferrarez.cursomc.domain.service.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

public abstract class AbstractService<T, ID> implements Service<T, ID>{

    public T findById(ID id){
        return getRepository().findById(id).orElse(null);
    }

    public T save(T obj){
        return getRepository().save(obj);
    }

    public abstract JpaRepository<T, ID> getRepository();
}
