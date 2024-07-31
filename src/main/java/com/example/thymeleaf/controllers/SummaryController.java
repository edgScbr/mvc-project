package com.example.thymeleaf.controllers;

import com.example.thymeleaf.controllers.responses.SummaryResponse;
import com.example.thymeleaf.services.SummaryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/")
@RequiredArgsConstructor
public class SummaryController {

    private final SummaryService summaryService;

    @GetMapping
    public String getSummaries(Model model) {
         SummaryResponse summary = summaryService.getSummaries();

        List<List<Object>> genderList = new ArrayList<>();

        summary.getGenderSummaryList().forEach( g -> {
            genderList.add(List.of(g.getGender(), g.getTotal()));
        });

        List<List<Object>> ageList = new ArrayList<>();

        summary.getAgeRangeSummaryList().forEach( a -> {
            ageList.add(List.of(a.getRange(), a.getMaleCount(), a.getFemaleCount(), a.getOtherCount()));
        });

        List<List<Object>> cityList = new ArrayList<>();

        summary.getCitySummaryList().forEach( c -> {
            cityList.add(List.of(c.getCity(), c.getMaleCount(), c.getFemaleCount(), c.getOtherCount()));
        });

        List<List<Object>> soList = new ArrayList<>();

        summary.getOperatingSystemSummaryList().forEach( o -> {
            soList.add(List.of(o.getOs(), o.getTotal()));
        });

         model.addAttribute("genderList", genderList);
         model.addAttribute("ageList", ageList);
         model.addAttribute("cityList", cityList);
        model.addAttribute("soList", soList);
         model.addAttribute("genderSummary", summary.getGenderSummaryList());
         model.addAttribute("genderSize", summary.getGenderSummaryList().size());
         model.addAttribute("ageSummary", summary.getAgeRangeSummaryList());
         model.addAttribute("citySummary", summary.getCitySummaryList());
         model.addAttribute("osSummary", summary.getOperatingSystemSummaryList());


         return "index";
    }
}
