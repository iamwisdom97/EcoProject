package com.example.eco.repository;

import com.example.eco.domain.ConvertEmployeeJobHistory;
import com.example.eco.domain.JobHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface JobHistoryRepository extends JpaRepository<JobHistory, Long> {
    @Query(value = "SELECT " +
            "jh.employee_id AS employeeId, " +
            "e.first_name AS firstName, " +
            "e.last_name AS lastName, " +
            "jh.start_date AS startDate, " +
            "jh.end_date AS endDate, " +
            "jh.job_id AS jobId, " +
            "jh.department_id AS departmentId, \n" +
            "(SELECT job_title FROM jobs WHERE jh.job_id = job_id) AS jobTitle, \n" +
            "(SELECT department_name FROM departments WHERE jh.department_id = department_id) AS departmentName \n" +
            "   FROM job_history jh, employees e \n" +
            "       WHERE jh.employee_id = e.employee_id \n" +
            "       AND e.employee_id =?1", nativeQuery = true)
    List<ConvertEmployeeJobHistory> getEmployeeJobHistoryByEmployeeId(int employeeId);
}
