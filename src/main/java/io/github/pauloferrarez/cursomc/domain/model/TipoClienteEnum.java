package io.github.pauloferrarez.cursomc.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter @AllArgsConstructor
public enum TipoClienteEnum {

    PESSOA_FISICA("F", "Pessoa Física"),
    PESSOA_JURIDICA("J", "Pessoa Jurídica");

    private final String id;
    private final String descricao;

    public static TipoClienteEnum toEnum(String id){
        if (id == null){
            return null;
        }
        for (TipoClienteEnum tipo : TipoClienteEnum.values()){
            if (id.equals(tipo.getId()))
                return tipo;
        }

        throw new IllegalArgumentException("Tipo de Cliente inválido!");
    }
}
