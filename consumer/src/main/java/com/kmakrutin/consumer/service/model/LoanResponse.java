package com.kmakrutin.consumer.service.model;

public class LoanResponse {
    private String fraudCheckStatus;
    private String reason;

    public LoanResponse(String fraudCheckStatus, String reason) {
        this.fraudCheckStatus = fraudCheckStatus;
        this.reason = reason;
    }

    public LoanResponse() {
    }

    public String getFraudCheckStatus() {
        return fraudCheckStatus;
    }

    public void setFraudCheckStatus(String fraudCheckStatus) {
        this.fraudCheckStatus = fraudCheckStatus;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
