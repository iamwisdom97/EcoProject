package com.example.eco.domain;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Table(name = "departments")
@Getter
public class Departments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "department_id")
    private int departmentId;

    @Column(name = "department_name")
    private String departmentName;

    @Column(name = "manager_id")
    private int managerId;

    @Column(name = "location_id")
    private int locationId;
}
