package com.donovansmangos.donovans_mangos.database.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Size(max = 150)
    @NotNull
    @Column(name = "mango_name", nullable = false, length = 150)
    private String mangoName;

    @Size(max = 150)
    @NotNull
    @Column(name = "country_of_origin", nullable = false, length = 150)
    private String countryOfOrigin;

    @NotNull
    @Column(name = "price", nullable = false)
    private Integer price;

}