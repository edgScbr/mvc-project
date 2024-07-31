package com.example.thymeleaf.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CitySummary {


    private String city;

    private Long maleCount;

    private Long femaleCount;

    private Long otherCount;
}
