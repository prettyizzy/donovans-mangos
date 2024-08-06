package com.donovansmangos.donovans_mangos.database.dao;

import com.donovansmangos.donovans_mangos.database.entities.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDAO extends JpaRepository<Product, Long> {
}
