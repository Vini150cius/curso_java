package com.vini150cius.project.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(Object id) {
        super("Resource not foung. Id " + id);
    }
}
