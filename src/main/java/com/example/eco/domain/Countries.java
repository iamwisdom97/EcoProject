package com.example.eco.domain;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Table(name = "countries")
@Getter
public class Countries {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "country_id")
    private String countryId;

    @Column(name = "country_name")
    private String countryName;

    @Column(name = "region_id")
    private int regionId;
}
