package com.example.clockHolder.service.port;

import java.time.LocalDate;

public interface ClockHolder {
    long millis();
    Long parseDateToMillis(String dateStr);
    long calculateDifferenceFromNow(long pastMillis);
    LocalDate millisToLocalDate(Long millis);
}
