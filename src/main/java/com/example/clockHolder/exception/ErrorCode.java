package com.example.clockHolder.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ErrorCode {
    BAD_INPUT_FORMAT("입력 형식이 틀렸습니다.");
    private final String message;
}
