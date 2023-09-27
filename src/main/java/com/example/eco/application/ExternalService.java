package com.example.eco.application;

import com.example.eco.externalAPI.BuildingInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
@RequiredArgsConstructor
public class ExternalService {

    private final BuildingInfoService buildingInfoService;

    public String getBuildingInformation(String sigunguCd, String bjdongCd) throws IOException {
        return buildingInfoService.getBuildingInformation(sigunguCd, bjdongCd);
    }
}
