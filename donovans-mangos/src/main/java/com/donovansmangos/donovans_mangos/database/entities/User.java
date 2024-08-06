package com.donovansmangos.donovans_mangos.database.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Size(max = 150)
    @NotNull
    @Column(name = "email", nullable = false, length = 150)
    private String email;

    @Size(max = 150)
    @NotNull
    @Column(name = "password", nullable = false, length = 150)
    private String password;

    @NotNull
    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "date_created", nullable = false)
    private Instant dateCreated;

}