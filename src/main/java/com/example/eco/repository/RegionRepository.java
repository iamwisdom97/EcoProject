package com.example.eco.repository;

import com.example.eco.domain.Regions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegionRepository extends JpaRepository<Regions, Long> {
}
