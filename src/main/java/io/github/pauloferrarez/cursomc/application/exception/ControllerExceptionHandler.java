package io.github.pauloferrarez.cursomc.application.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@ControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(CustomException.class)
    public ResponseEntity<ExceptionTemplate> customException(CustomException e, HttpServletRequest request){

        ExceptionTemplate exceptionTemplate = new ExceptionTemplate(e.getStatus().value(), e.getMessage(), new Date());

        return new ResponseEntity<>(exceptionTemplate, e.getStatus());
    }
}
