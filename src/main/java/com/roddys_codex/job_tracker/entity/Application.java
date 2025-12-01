package com.roddys_codex.job_tracker.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@Entity
@Table (name = "application")
@AllArgsConstructor
@NoArgsConstructor
public class Application {

    @Id
    @GeneratedValue
    @UuidGenerator
    @Getter
    @Setter
    private UUID id;

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String status;
}
