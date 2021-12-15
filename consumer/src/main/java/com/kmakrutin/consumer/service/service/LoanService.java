package com.kmakrutin.consumer.service.service;

import com.kmakrutin.consumer.service.model.LoanRequest;
import com.kmakrutin.consumer.service.model.LoanResponse;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class LoanService {
    private final RestTemplate restTemplate;

    public LoanService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder
                .build();
    }

    public LoanResponse fraudCheck(LoanRequest loanRequest) {
        final var response = restTemplate.exchange("http://localhost:6565/fraudcheck", HttpMethod.PUT, new HttpEntity<>(loanRequest), LoanResponse.class);
        return response.getBody();
    }
}
