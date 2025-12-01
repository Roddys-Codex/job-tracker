package com.roddys_codex.job_tracker.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@Entity
@Table (name = "candidate")
@NoArgsConstructor
@AllArgsConstructor
public class Candidate {

    @Id
    @GeneratedValue
    @UuidGenerator
    private UUID id;

    @Getter
    @Setter
    private String firstName;

    @Getter
    @Setter
    private String lastName;
}
