package io.github.pauloferrarez.cursomc.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;

@Entity
@Table(name = "ENDERECO")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Endereco implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_ENDERECO")
    private Integer id;

    @Column(name = "LOGRADOURO")
    private String logradouro;

    @Column(name = "NUMERO")
    private String numero;

    @Column(name = "COMPLEMENTO")
    private String complemento;

    @Column(name = "BAIRRO")
    private String bairro;

    @Column(name = "CEP")
    private String cep;

    @ManyToOne
    @JoinColumn(name = "CIDADE", referencedColumnName = "ID_CIDADE")
    private Cidade cidade;

    @ManyToOne
    @JoinColumn(name = "CLIENTE", referencedColumnName = "ID_CLIENTE")
    private Cliente cliente;
}
