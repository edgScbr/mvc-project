package com.example.thymeleaf.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OperatingSystemSummary {



    private String os;

    private Long total;
}
