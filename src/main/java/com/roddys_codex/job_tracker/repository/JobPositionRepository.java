package com.roddys_codex.job_tracker.repository;

import com.roddys_codex.job_tracker.entity.Company;
import com.roddys_codex.job_tracker.entity.JobPosition;
import org.jspecify.annotations.NullMarked;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@NullMarked
public interface JobPositionRepository extends CrudRepository<JobPosition, UUID> {

    Optional<JobPosition> findById(UUID id);
    List<JobPosition> findAll();
    List<JobPosition> findByName(String name);
}
