package com.example.eco.repository;

import com.example.eco.domain.Jobs;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Jobs, Long> {
}
