package com.example.demo.advice;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@org.springframework.web.bind.annotation.ControllerAdvice
public class ControllerAdvice extends ResponseEntityExceptionHandler{
    @ExceptionHandler(EmptyResultDataAccessException.class)
    public ResponseEntity<String> handleEmpltyResultDataAccessException(EmptyResultDataAccessException exc){
    	return new ResponseEntity<String>("Value Not found please try again",HttpStatus.NOT_FOUND);
    }
}
