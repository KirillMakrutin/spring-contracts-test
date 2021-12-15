package com.kmakrutin.producer.model;

public class LoanResponse {
    private FraudCheckStatus fraudCheckStatus;
    private String reason;

    public LoanResponse(FraudCheckStatus fraudCheckStatus, String reason) {
        this.fraudCheckStatus = fraudCheckStatus;
        this.reason = reason;
    }

    public LoanResponse() {
    }

    public FraudCheckStatus getFraudCheckStatus() {
        return fraudCheckStatus;
    }

    public void setFraudCheckStatus(FraudCheckStatus fraudCheckStatus) {
        this.fraudCheckStatus = fraudCheckStatus;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
