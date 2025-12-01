package com.roddys_codex.job_tracker.controller;

import com.roddys_codex.job_tracker.entity.JobPosition;
import com.roddys_codex.job_tracker.repository.JobPositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobPosition")
public class JobPositionController {

    JobPositionRepository jobPositionRepository;

    public JobPositionController(@Autowired JobPositionRepository jobPositionController) {
        this.jobPositionRepository = jobPositionController;
    }

    @GetMapping("/all")
    public List<JobPosition> getAll() {
        return jobPositionRepository.findAll();
    }

    @PostMapping("/create")
    public JobPosition create(@RequestBody JobPosition jobPosition) {
        return jobPositionRepository.save(jobPosition);
    }
}
