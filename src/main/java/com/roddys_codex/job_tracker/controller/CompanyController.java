package com.roddys_codex.job_tracker.controller;

import com.roddys_codex.job_tracker.entity.Company;
import com.roddys_codex.job_tracker.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/company")
public class CompanyController {

    CompanyRepository companyRepository;

    public CompanyController(@Autowired CompanyRepository companyController) {
        this.companyRepository = companyController;
    }

    @GetMapping("/all")
    public List<Company> getAll() {
        return companyRepository.findAll();
    }

    @PostMapping("/create")
    public Company create(@RequestBody Company company) {
        return companyRepository.save(company);
    }
}
