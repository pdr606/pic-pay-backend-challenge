package com.example.picpaychallenge.resource.exceptions;

import com.example.picpaychallenge.services.exceptions.ResourceNotFoundException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.time.Instant;

public class ExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<StandardError> resourceNotFound(ResourceNotFoundException e, HttpServletRequest request){
        String error = "Resource not found";
        HttpStatus httpStatus = HttpStatus.NOT_FOUND;
        StandardError err = new StandardError(Instant.now(), httpStatus.value(), error, e.getMessage(), request.getRequestURI());
        return ResponseEntity.status(httpStatus).body(err);
    }
}
