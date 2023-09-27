package com.example.eco.service;

import com.example.eco.domain.Regions;
import com.example.eco.repository.RegionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RegionService {
    private final RegionRepository regionRepository;

    public List<Regions> getRegions() {
        return regionRepository.findAll();
    }
}
