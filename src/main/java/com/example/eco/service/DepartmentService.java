package com.example.eco.service;

import com.example.eco.domain.Departments;
import com.example.eco.repository.DepartmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DepartmentService {
    private final DepartmentRepository departmentRepository;

    public List<Departments> getDepartments() {
        return departmentRepository.findAll();
    }
}
