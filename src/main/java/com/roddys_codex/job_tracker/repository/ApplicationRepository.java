package com.roddys_codex.job_tracker.repository;

import com.roddys_codex.job_tracker.entity.Application;
import org.jspecify.annotations.NullMarked;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@NullMarked
public interface ApplicationRepository extends JpaRepository<Application, UUID> {

    List<Application> findAll();

    Optional<Application> findById(UUID id);

}
