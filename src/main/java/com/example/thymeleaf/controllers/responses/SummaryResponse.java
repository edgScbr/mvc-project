package com.example.thymeleaf.controllers.responses;



import com.example.thymeleaf.models.AgeRangeSummary;
import com.example.thymeleaf.models.CitySummary;
import com.example.thymeleaf.models.GenderSummary;
import com.example.thymeleaf.models.OperatingSystemSummary;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class SummaryResponse {

    private List<GenderSummary> genderSummaryList;
    private List<AgeRangeSummary> ageRangeSummaryList;
    private List<CitySummary> citySummaryList;
    private List<OperatingSystemSummary> operatingSystemSummaryList;
}
