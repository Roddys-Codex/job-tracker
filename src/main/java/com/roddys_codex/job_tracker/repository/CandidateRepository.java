package com.roddys_codex.job_tracker.repository;

import com.roddys_codex.job_tracker.entity.Candidate;
import org.jspecify.annotations.NullMarked;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@NullMarked
public interface CandidateRepository extends CrudRepository<Candidate, UUID> {

    List<Candidate> findAll();

    Optional<Candidate> findById(UUID id);
}
