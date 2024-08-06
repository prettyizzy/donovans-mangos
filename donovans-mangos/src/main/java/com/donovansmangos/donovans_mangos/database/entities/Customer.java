package com.donovansmangos.donovans_mangos.database.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@Entity
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Size(max = 150)
    @NotNull
    @Column(name = "first_name", nullable = false, length = 150)
    private String firstName;

    @Size(max = 150)
    @NotNull
    @Column(name = "last_name", nullable = false, length = 150)
    private String lastName;

    @Size(max = 150)
    @NotNull
    @Column(name = "address_line", nullable = false, length = 150)
    private String addressLine;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

}