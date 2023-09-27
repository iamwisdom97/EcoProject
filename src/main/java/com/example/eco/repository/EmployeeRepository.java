package com.example.eco.repository;

import com.example.eco.domain.ConvertEmployeeInfo;
import com.example.eco.domain.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmployeeRepository extends JpaRepository<Employees, Long> {

    Employees findByEmployeeId(int employeeId);

    @Query(value = "SELECT " +
            "first_name AS firstName, " +
            "last_name AS lastName, email, " +
            "phone_number AS phoneNumber, " +
            "hire_date AS hireDate, \n" +
            "(SELECT department_name  FROM departments WHERE department_id = e.department_id) AS departmentName, \n" +
            "(SELECT job_title  FROM jobs WHERE job_id = e.job_id) AS jobTitle \n" +
            "   FROM employees e " +
            "       WHERE employee_id  =?1 ", nativeQuery = true)
    ConvertEmployeeInfo getEmployeeInfoByEmployeeId(int employeeId);

    @Query(value = "UPDATE employees \n" +
            "SET salary = salary + (salary * (?1 / 100)) \n" +
            "WHERE department_id =?2 ", nativeQuery = true)
    Employees updateEmployeeForDepartmentSalary(int raisePercentage, int departmentId);
}
