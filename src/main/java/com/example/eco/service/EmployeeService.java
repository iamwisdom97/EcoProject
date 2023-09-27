package com.example.eco.service;

import com.example.eco.domain.Employees;
import com.example.eco.payload.request.SalaryIncreaseRateByDepartmentRequest;
import com.example.eco.payload.response.EmployeeInfoResponse;
import com.example.eco.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public List<Employees> getEmployees() {
        return employeeRepository.findAll();
    }

    public EmployeeInfoResponse getEmployeeInfo(int employeeId) {
        return EmployeeInfoResponse.employeeInfo(employeeRepository.getEmployeeInfoByEmployeeId(employeeId));
    }

    public Employees updateEmployeeForDepartmentSalary(SalaryIncreaseRateByDepartmentRequest request) {
        return employeeRepository.updateEmployeeForDepartmentSalary(request.getRaisePercentage(), request.getDepartmentId());
    }
}
