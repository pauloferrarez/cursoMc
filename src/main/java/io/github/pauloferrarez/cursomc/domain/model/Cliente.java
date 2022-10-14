package io.github.pauloferrarez.cursomc.domain.model;

import io.github.pauloferrarez.cursomc.domain.model.enums.TipoClienteEnum;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "CLIENTE")
@Getter @Setter @NoArgsConstructor
public class Cliente implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CLIENTE")
    private Integer id;

    @Column(name = "NOME")
    private String nome;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "CPF_CNPJ")
    private String cpfCnpj;

    @Column(name = "TIPO_CLIENTE")
    private String tipoCliente;

    @OneToMany(mappedBy = "cliente")
    private List<Endereco> enderecos = new ArrayList<>();

    @ElementCollection
    @CollectionTable(name = "TELEFONE")
    private Set<String> telefones = new HashSet<>();


    public Cliente(Integer id, String nome, String email, String cpfCnpj, TipoClienteEnum tipoCliente) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.cpfCnpj = cpfCnpj;
        this.tipoCliente = tipoCliente.getId();
    }

    public TipoClienteEnum getTipoCliente() {
        return TipoClienteEnum.toEnum(tipoCliente);
    }

    public void setTipoCliente(TipoClienteEnum tipoCliente) {
        this.tipoCliente = tipoCliente.getId();
    }
}
