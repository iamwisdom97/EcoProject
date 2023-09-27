package com.example.eco.payload.response;

import com.example.eco.domain.ConvertEmployeeInfo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeInfoResponse {
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String hireDate;
    private String job;
    private String department;

    public static EmployeeInfoResponse employeeInfo(ConvertEmployeeInfo employeeInfo) {
        EmployeeInfoResponse response = new EmployeeInfoResponse();

        response.firstName = employeeInfo.getFirstName();
        response.lastName = employeeInfo.getLastName();
        response.email = employeeInfo.getEmail();
        response.phoneNumber = employeeInfo.getPhoneNumber();
        response.hireDate = employeeInfo.getHireDate();
        response.job = employeeInfo.getJobTitle();
        response.department = employeeInfo.getDepartmentName();

        return response;
    }
}
