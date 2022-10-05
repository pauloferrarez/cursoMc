package io.github.pauloferrarez.cursomc.application.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class ExceptionTemplate implements Serializable {

    private Integer status;
    private String message;
    private Date timeStamp;
}
