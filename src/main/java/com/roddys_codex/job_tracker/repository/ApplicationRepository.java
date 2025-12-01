package com.roddys_codex.job_tracker.repository;

import com.roddys_codex.job_tracker.entity.Application;
import org.jspecify.annotations.NullMarked;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@NullMarked
public interface ApplicationRepository extends CrudRepository<Application, UUID> {

    List<Application> findAll();

    Optional<Application> findById(UUID id);

    List<Application> findByName(String name);
}
