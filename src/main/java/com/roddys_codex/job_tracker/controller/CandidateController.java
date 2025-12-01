package com.roddys_codex.job_tracker.controller;

import com.roddys_codex.job_tracker.entity.Candidate;
import com.roddys_codex.job_tracker.repository.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/candidate")
public class CandidateController {

    CandidateRepository candidateRepository;

    public CandidateController(@Autowired CandidateRepository candidateRepository) {
        this.candidateRepository = candidateRepository;
    }

    @GetMapping("/all")
    public List<Candidate> getAll() {
        return candidateRepository.findAll();
    }

    @PostMapping("/create")
    public Candidate create(@RequestBody Candidate candidate) {
        return candidateRepository.save(candidate);
    }
}
