package io.github.pauloferrarez.cursomc.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Estado implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_ESTADO")
    private Integer id;

    @Column(name = "NOME")
    private String nome;

    @Column(name = "UF")
    private String uf;
}
