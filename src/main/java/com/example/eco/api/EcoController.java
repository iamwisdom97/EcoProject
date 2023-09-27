package com.example.eco.api;

import com.example.eco.application.EcoService;
import com.example.eco.domain.Employees;
import com.example.eco.payload.request.SalaryIncreaseRateByDepartmentRequest;
import com.example.eco.payload.response.DepartmentAndLocationResponse;
import com.example.eco.payload.response.EmployeeInfoResponse;
import com.example.eco.payload.response.EmployeeJobHistoryResponse;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/eco")
public class EcoController {
    private final EcoService ecoService;

    @GetMapping("/employee/{id}")
    @Operation(description = "특정 사원의 현재 정보 조회")
    public ResponseEntity<EmployeeInfoResponse> getEmployeeInformation(@PathVariable int id) {
        return ResponseEntity.ok(ecoService.getEmployeeInformation(id));
    }

    @GetMapping("/job-history/{id}")
    @Operation(description = "특정 사원의 이력 정보 조회")
    public ResponseEntity<List<EmployeeJobHistoryResponse>> getEmployeeJobHistory(@PathVariable int id) {
        return ResponseEntity.ok(ecoService.getEmployeeJobHistory(id));
    }

    @GetMapping("/dept-location/{id}")
    @Operation(description = "부서 및 위치 정보 조회")
    public ResponseEntity<DepartmentAndLocationResponse> getDepartmentAndLocation(@PathVariable int id) {
        return ResponseEntity.ok(ecoService.getDepartmentAndLocation(id));
    }

    @PutMapping("/employee")
    @Operation(description = "특정 부서의 급여를 특정 비율로 인상 및 사원 정보 업데이트")
    public ResponseEntity<Employees> updateEmployeeForDepartmentSalary(@RequestBody SalaryIncreaseRateByDepartmentRequest request) {
        return ResponseEntity.ok(ecoService.updateEmployeeForDepartmentSalary(request));
    }
}
