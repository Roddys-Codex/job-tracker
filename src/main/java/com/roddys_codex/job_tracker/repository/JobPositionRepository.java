package com.roddys_codex.job_tracker.repository;

import com.roddys_codex.job_tracker.entity.JobPosition;
import org.jspecify.annotations.NullMarked;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@NullMarked
public interface JobPositionRepository extends JpaRepository<JobPosition, UUID> {

    Optional<JobPosition> findById(UUID id);
    List<JobPosition> findAll();
    List<JobPosition> findByName(String name);
}
