package com.roddys_codex.job_tracker.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@Entity
@Table (name = "company")
@AllArgsConstructor
@NoArgsConstructor
public class Company {

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
