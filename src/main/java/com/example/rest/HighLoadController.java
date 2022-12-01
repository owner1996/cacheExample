package com.example.rest;

import com.example.model.MyRecord;
import com.example.service.HighLoadService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HighLoadController {

    private final HighLoadService highLoadService;

    public HighLoadController(HighLoadService highLoadService) {
        this.highLoadService = highLoadService;
    }

    @GetMapping("/create")
    public MyRecord getOrCreate() {
        return highLoadService.getOrCreateRecord(1);
    }
}
