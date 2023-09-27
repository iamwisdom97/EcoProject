package com.example.eco.service;

import com.example.eco.domain.Countries;
import com.example.eco.repository.CountriesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CountriesService {
    private final CountriesRepository countriesRepository;

    public List<Countries> getCountries() {
        return countriesRepository.findAll();
    }
}
