package com.example.eco.payload.request;

import lombok.Getter;

@Getter
public class SalaryIncreaseRateByDepartmentRequest {
    int raisePercentage;
    int departmentId;
}
