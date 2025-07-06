package com.example.springcrud.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Map;
import java.util.NoSuchElementException;

@RestControllerAdvice
public class NoSuchElementExceptionHandler {

    @ResponseStatus( value = HttpStatus.NOT_FOUND )
    @ExceptionHandler(NoSuchElementException.class)
    public Map<String,String> handleNoSuchElementException(NoSuchElementException ex) {
        return Map.of("error", ex.getMessage());
    }
}
