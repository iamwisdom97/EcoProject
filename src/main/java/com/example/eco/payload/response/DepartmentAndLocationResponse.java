package com.example.eco.payload.response;

import com.example.eco.domain.ConvertDepartmentAndLocation;
import com.example.eco.domain.ConvertEmployeeInfo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentAndLocationResponse {
    private String departmentName;
    private String locationId;
    private String streetAddress;
    private String city;
    private String countryId;
    private String countryName;
    private String regionId;
    private String regionName;

    public static DepartmentAndLocationResponse departmentAndLocation(ConvertDepartmentAndLocation departmentAndLocation) {
        DepartmentAndLocationResponse response = new DepartmentAndLocationResponse();

        response.departmentName = departmentAndLocation.getDepartmentName();
        response.locationId = departmentAndLocation.getLocationId();
        response.streetAddress = departmentAndLocation.getStreetAddress();
        response.city = departmentAndLocation.getCity();
        response.countryId = departmentAndLocation.getCountryId();
        response.countryName = departmentAndLocation.getCountryName();
        response.regionId = departmentAndLocation.getRegionId();
        response.regionName = departmentAndLocation.getRegionName();

        return response;
    }
}
