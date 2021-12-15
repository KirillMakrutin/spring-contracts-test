package com.kmakrutin.consumer.contract;

import com.kmakrutin.consumer.service.model.LoanRequest;
import com.kmakrutin.consumer.service.service.LoanService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.cloud.contract.stubrunner.spring.StubRunnerProperties;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
@AutoConfigureStubRunner(ids = {"com.kmakrutin:producer:+:stubs:6565"},
        stubsMode = StubRunnerProperties.StubsMode.LOCAL)
public class ContractTest {
    @Autowired
    private LoanService loanService;

    @Test
    void testFraudCheck() {
        final var loanRequest = new LoanRequest();
        loanRequest.setClientId("0123456789");
        loanRequest.setLoanRequestAmount(9_999L);
        final var loanResponse = loanService.fraudCheck(loanRequest);
        Assertions.assertNotNull(loanResponse);
    }

}
