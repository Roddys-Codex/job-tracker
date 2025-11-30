package com.roddys_codex.job_tracker.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table (name = "jobposition")
@NoArgsConstructor
@AllArgsConstructor
public class JobPosition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private UUID id;

    @Getter
    @Setter
    private String role;

    public JobPosition(String role) {
        this.role = role;
    }
}
