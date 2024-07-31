package com.example.thymeleaf.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AgeRangeSummary {


    private String range;

    private Integer maleCount;

    private Integer femaleCount;

    private Integer otherCount;
}
