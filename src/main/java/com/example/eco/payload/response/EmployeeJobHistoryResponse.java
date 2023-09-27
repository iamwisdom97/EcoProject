package com.example.eco.payload.response;

import com.example.eco.domain.ConvertEmployeeJobHistory;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeJobHistoryResponse {

    private String employeeId;
    private String firstName;
    private String lastName;
    private String startDate;
    private String endDate;
    private String job;
    private String jobId;
    private String department;
    private String departmentId;

    public static EmployeeJobHistoryResponse employeeJobHistory(ConvertEmployeeJobHistory employeeJobHistory) {
        EmployeeJobHistoryResponse response = new EmployeeJobHistoryResponse();

        response.employeeId = employeeJobHistory.getEmployeeId();
        response.firstName = employeeJobHistory.getFirstName();
        response.lastName = employeeJobHistory.getLastName();
        response.startDate = employeeJobHistory.getStartDate();
        response.endDate = employeeJobHistory.getEndDate();
        response.job = employeeJobHistory.getJobTitle();
        response.jobId = employeeJobHistory.getJobId();
        response.department = employeeJobHistory.getDepartmentName();
        response.departmentId = employeeJobHistory.getDepartmentId();

        return response;
    }
}
