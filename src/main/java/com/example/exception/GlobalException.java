package com.example.exception;

import static com.example.exception.ErrorCode.BAD_INPUT_FORMAT;

public class GlobalException extends ClockHodlerException {
    public GlobalException(ErrorCode e) {
        super(e);
    }
    public static class BadInputFormatException extends ClockHodlerException {
        public BadInputFormatException() {
            super(BAD_INPUT_FORMAT);
        }
    }
}
