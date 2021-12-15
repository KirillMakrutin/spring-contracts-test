package com.kmakrutin.producer.contractTest;

import com.kmakrutin.producer.controller.FraudController;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.jupiter.api.BeforeEach;

public class BaseTestClass {

    @BeforeEach
    public void setup() {
        RestAssuredMockMvc.standaloneSetup(new FraudController());
    }
}