package com.kmakrutin.consumer.service.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder(alphabetic = true)
public class LoanRequest {

    @JsonProperty("client.id")
    private String clientId;

    private Long loanAmount;

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public Long getLoanAmount() {
        return loanAmount;
    }

    public void setLoanRequestAmount(Long loanAmount) {
        this.loanAmount = loanAmount;
    }
}
