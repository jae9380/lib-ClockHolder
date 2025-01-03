package com.example.exception;

import lombok.Getter;

@Getter
public class ClockHodlerException extends RuntimeException {
    private final ErrorCode errorCode;

    public ClockHodlerException(ErrorCode e) {
        super(e.getMessage());
        this.errorCode = e;
    }
}