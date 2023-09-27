package com.example.eco.repository;

import com.example.eco.domain.ConvertDepartmentAndLocation;
import com.example.eco.domain.Locations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface LocationRepository extends JpaRepository<Locations, Long> {

    @Query(value = "SELECT \n" +
            "   d.department_id AS departmentId, \n" +
            "   d.department_name AS departmentName, \n" +
            "   l.location_id AS locationId, \n" +
            "   l.street_address AS streetAddress, \n" +
            "   l.city AS city,\n" +
            "   l.country_id AS countryId, \n" +
            "   c.country_name AS countryName, \n" +
            "   c.region_id AS regionId, \n" +
            "   (SELECT region_name FROM regions WHERE c.region_id = region_id) AS regionName \n" +
            "       FROM departments d, locations l, countries c \n" +
            "           WHERE d.location_id = l.location_id \n" +
            "           AND l.country_id = c.country_id \n" +
            "           AND department_id =?1 ", nativeQuery = true)
    ConvertDepartmentAndLocation getDepartmentAndLocationByDepartmentId(int departmentId);

}
