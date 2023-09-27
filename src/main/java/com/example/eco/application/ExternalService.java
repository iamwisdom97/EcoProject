package com.example.eco.application;

import com.example.eco.externalAPI.BuildingInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
@RequiredArgsConstructor
public class ExternalService {

    private final BuildingInfoService buildingInfoService;

    public String getBuildingInformation() throws IOException {
        return buildingInfoService.getBuildingInformation();
    }
}
