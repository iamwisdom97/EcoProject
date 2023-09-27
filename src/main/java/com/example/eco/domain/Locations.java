package com.example.eco.domain;

import lombok.Getter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "locations")
@Getter
public class Locations {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "location_id")
    private int locationId;

    @Column(name = "street_address")
    private String streetAddress;

    @Column(name = "postalCode")
    private String postal_code;

    @Column(name = "city")
    private String city;

    @Column(name = "state_province")
    private String stateProvince;

    @Column(name = "country_id")
    private String countryId;
}
