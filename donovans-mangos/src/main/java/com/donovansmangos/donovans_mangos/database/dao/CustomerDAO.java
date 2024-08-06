package com.donovansmangos.donovans_mangos.database.dao;

import com.donovansmangos.donovans_mangos.database.entities.*;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CustomerDAO extends JpaRepository<Customer, Long> {
}
