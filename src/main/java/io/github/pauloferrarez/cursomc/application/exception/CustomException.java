package io.github.pauloferrarez.cursomc.application.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter @Setter
public class CustomException extends RuntimeException{

    private final String message;
    private final HttpStatus status;

    public CustomException(String message){
        this(message, HttpStatus.BAD_REQUEST);
    }

    public CustomException(String message, HttpStatus status){
        this.message = message;
        this.status = status;
    }

}
