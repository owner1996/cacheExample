package com.example.model;

import java.time.LocalTime;

public record MyRecord(
        int id,
        LocalTime createTime
) {
}
