package com.example.eco.service;

import com.example.eco.domain.Jobs;
import com.example.eco.repository.JobRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class JobService {
    private final JobRepository jobRepository;

    public List<Jobs> getJobs() {
        return jobRepository.findAll();
    }
}
