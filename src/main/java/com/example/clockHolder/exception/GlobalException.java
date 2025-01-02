package com.example.clockHolder.exception;

import static com.example.clockHolder.exception.ErrorCode.BAD_INPUT_FORMAT;

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
