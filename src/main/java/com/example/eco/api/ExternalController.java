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
    @Operation(description = "건축물대장을 조회하는 OpenAPI")
    public ResponseEntity<String> getBuildingInformation() throws IOException {
        return ResponseEntity.ok(externalService.getBuildingInformation());
    }
}
