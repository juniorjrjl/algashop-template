package com.algaworks.algashop.template.domain.model;

public class DomainException extends RuntimeException{

    public DomainException() {}

    public DomainException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public DomainException(final String message) {
        super(message);
    }
}
