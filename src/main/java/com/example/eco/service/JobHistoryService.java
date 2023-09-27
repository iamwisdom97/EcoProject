package com.example.eco.service;

import com.example.eco.domain.ConvertEmployeeJobHistory;
import com.example.eco.domain.JobHistory;
import com.example.eco.payload.response.EmployeeJobHistoryResponse;
import com.example.eco.repository.JobHistoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class JobHistoryService {
    private final JobHistoryRepository jobHistoryRepository;

    public List<JobHistory> getJobHistory() {
        return jobHistoryRepository.findAll();
    }

    public List<EmployeeJobHistoryResponse> getEmployeeJobHistory(int employeeId) {
        List<EmployeeJobHistoryResponse> jobHistory = new ArrayList<>();

        jobHistoryRepository.getEmployeeJobHistoryByEmployeeId(employeeId)
            .forEach(convertEmployeeJobHistory ->
                    jobHistory.add(EmployeeJobHistoryResponse.employeeJobHistory(convertEmployeeJobHistory)
            )
        );

        return jobHistory;
    }
}
