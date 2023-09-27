package com.example.eco.repository;

import com.example.eco.domain.Countries;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountriesRepository extends JpaRepository<Countries, Long> {
}
