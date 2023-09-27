package com.example.eco.api;

import com.example.eco.application.ExternalService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/external")
public class ExternalController {

    private final ExternalService externalService;

    @GetMapping("")
    @Operation(summary = "건축물대장을 조회하는 OpenAPI", description = "파라미터 예시 : sigunguCd:11680, bjdongCd:10300")
    public ResponseEntity<String> getBuildingInformation(String sigunguCd, String bjdongCd) throws IOException {
        return ResponseEntity.ok(externalService.getBuildingInformation(sigunguCd, bjdongCd));
    }
}
