package com.roddys_codex.job_tracker.repository;

import com.roddys_codex.job_tracker.entity.Company;
import org.jspecify.annotations.NullMarked;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@NullMarked
public interface CompanyRepository extends JpaRepository<Company, UUID> {

    Optional<Company> findById(UUID id);
    List<Company> findAll();
    List<Company> findByName(String name);
}
