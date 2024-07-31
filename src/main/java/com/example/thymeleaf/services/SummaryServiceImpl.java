package com.example.thymeleaf.services;

import com.example.thymeleaf.controllers.responses.SummaryResponse;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class SummaryServiceImpl implements SummaryService{

    @Autowired
    RestTemplate restTemplate;

    @Override
    public SummaryResponse getSummaries() {
        SummaryResponse summaryResponse = restTemplate
                .getForEntity("http://localhost:8080/summaries", SummaryResponse.class).getBody();
        return summaryResponse;
    }
}
