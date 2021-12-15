package com.kmakrutin.producer.controller;

import com.kmakrutin.producer.model.FraudCheckStatus;
import com.kmakrutin.producer.model.LoanRequest;
import com.kmakrutin.producer.model.LoanResponse;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FraudController {

    @PutMapping(value = "/fraudcheck", consumes = "application/json", produces = "application/json")
    public LoanResponse check(@RequestBody LoanRequest loanRequest) {

        if (loanRequest.getLoanAmount() > 9000) {
            return new LoanResponse(FraudCheckStatus.FRAUD, "Amount too high");
        } else {
            return new LoanResponse(FraudCheckStatus.OK, "Amount OK");
        }
    }
}