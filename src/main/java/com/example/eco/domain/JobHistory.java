package com.example.eco.domain;

import lombok.Getter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "job_history")
@Getter
public class JobHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private int employeeId;

    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "end_date")
    private Date endDate;

    @Column(name = "job_id")
    private String jobId;

    @Column(name = "department_id")
    private int departmentId;
}
