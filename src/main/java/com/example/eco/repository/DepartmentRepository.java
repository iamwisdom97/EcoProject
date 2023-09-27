package com.example.eco.repository;

import com.example.eco.domain.Departments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Departments, Long> {
}
