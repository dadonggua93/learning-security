package org.example.security.common.exception;


import org.springframework.security.core.AuthenticationException;

public class VerificationCodeException extends AuthenticationException {
    public VerificationCodeException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
