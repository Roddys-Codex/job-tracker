package com.roddys_codex.job_tracker.controller;

import com.roddys_codex.job_tracker.entity.Application;
import com.roddys_codex.job_tracker.repository.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/application")
public class ApplicationController {

    ApplicationRepository applicationRepository;

    public ApplicationController(@Autowired ApplicationRepository applicationRepository) {
        this.applicationRepository = applicationRepository;
    }

    @GetMapping("/all")
    public List<Application> getAll() {
        return applicationRepository.findAll();
    }

    @PostMapping("/create")
    public Application create(@RequestBody Application application) {
        return applicationRepository.save(application);
    }
}
