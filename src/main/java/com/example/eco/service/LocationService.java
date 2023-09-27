package com.example.eco.service;

import com.example.eco.domain.Locations;
import com.example.eco.payload.response.DepartmentAndLocationResponse;
import com.example.eco.repository.LocationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LocationService {
    private final LocationRepository locationRepository;

    public List<Locations> getLocations() {
        return locationRepository.findAll();
    }

    public DepartmentAndLocationResponse getDepartmentAndLocation(int departmentId) {
        return DepartmentAndLocationResponse.departmentAndLocation(locationRepository.getDepartmentAndLocationByDepartmentId(departmentId));
    }
}
