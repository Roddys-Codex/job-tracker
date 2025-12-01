package com.roddys_codex.job_tracker.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@Entity
@Table (name = "jobposition")
@NoArgsConstructor
@AllArgsConstructor
public class JobPosition {

    @Id
    @GeneratedValue
    @UuidGenerator
    @Getter
    @Setter
    private UUID id;

    @Getter
    @Setter
    private String name;
}
