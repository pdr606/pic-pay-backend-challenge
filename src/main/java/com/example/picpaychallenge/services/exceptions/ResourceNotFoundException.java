package com.example.picpaychallenge.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(Long id){
        super("Id not found: " + id);
    }
}
