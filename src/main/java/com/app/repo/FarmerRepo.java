package com.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Farmer;

public interface FarmerRepo extends JpaRepository<Farmer, Integer> {

}
