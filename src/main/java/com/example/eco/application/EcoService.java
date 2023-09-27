package com.example.eco.application;

import com.example.eco.domain.*;
import com.example.eco.payload.request.SalaryIncreaseRateByDepartmentRequest;
import com.example.eco.payload.response.DepartmentAndLocationResponse;
import com.example.eco.payload.response.EmployeeInfoResponse;
import com.example.eco.payload.response.EmployeeJobHistoryResponse;
import com.example.eco.service.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EcoService {
    private final CountriesService countriesService;
    private final DepartmentService departmentService;
    private final EmployeeService employeeService;
    private final JobHistoryService jobHistoryService;
    private final JobService jobService;
    private final LocationService locationService;
    private final RegionService regionService;

    public EmployeeInfoResponse getEmployeeInformation(int employeeId) {
        return employeeService.getEmployeeInfo(employeeId);
    }

    public List<EmployeeJobHistoryResponse> getEmployeeJobHistory(int employeeId) {
        return jobHistoryService.getEmployeeJobHistory(employeeId);
    }

    public DepartmentAndLocationResponse getDepartmentAndLocation(int departmentId) {
        return locationService.getDepartmentAndLocation(departmentId);
    }

    public Employees updateEmployeeForDepartmentSalary(SalaryIncreaseRateByDepartmentRequest request) {
        return employeeService.updateEmployeeForDepartmentSalary(request);
    }

    public List<Countries> getCountries() {
        return countriesService.getCountries();
    }

    public List<Departments> getDepartments() {
        return departmentService.getDepartments();
    }

    public List<Employees> getEmployees() {
        return employeeService.getEmployees();
    }

    public List<JobHistory> getJobHistory() {
        return jobHistoryService.getJobHistory();
    }

    public List<Jobs> getJobs() {
        return jobService.getJobs();
    }

    public List<Locations> getLocations() {
        return locationService.getLocations();
    }

    public List<Regions> getRegions() {
        return regionService.getRegions();
    }
}
