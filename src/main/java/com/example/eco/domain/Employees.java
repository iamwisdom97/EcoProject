package com.example.eco.domain;

import lombok.Getter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "employees")
@Getter
public class Employees {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private int employeeId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "hire_date")
    private Date hireDate;

    @Column(name = "job_id")
    private String jobId;

    @Column(name = "salary")
    private BigDecimal salary;

    @Column(name = "commission_pct")
    private BigDecimal commissionPct;

    @Column(name = "manager_id")
    private int managerId;

    @Column(name = "department_id")
    private int departmentId;
}
