package com.example.service;

import com.example.model.MyRecord;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.time.LocalTime;
import java.util.concurrent.TimeUnit;


@Service

public class HighLoadService {

    @Cacheable (cacheNames = {"recordsCache"}, key = "#recordId")
    public MyRecord getOrCreateRecord(int id) {
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new MyRecord(id, LocalTime.now());
    }
}
