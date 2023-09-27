package com.example.eco.domain;


import lombok.Getter;

import javax.persistence.*;

@Entity
@Table(name = "regions")
@Getter
public class Regions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int regionId;

    @Column(name = "region_name")
    private String regionName;
}
