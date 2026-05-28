package com.algaworks.algashop.billingscheduler.presentation;

public class GatewayTimeoutException extends RuntimeException {

    public GatewayTimeoutException() {

    }

    public GatewayTimeoutException(final String message, final Throwable cause) {
        super(message, cause);
    }
}
