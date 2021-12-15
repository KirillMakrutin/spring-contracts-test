package contracts

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    name("fraud_attack_rejected")
    request {
        method 'PUT'
        url '/fraudcheck'
        body([
                "client.id": $(regex('[0-9]{10}')),
                loanAmount: 9999
        ])
        headers {
            contentType('application/json')
        }
    }
    response {
        status OK()
        body([
                "fraudCheckStatus": "FRAUD",
                "reason": "Amount too high"
        ])
        headers {
            contentType('application/json')
        }
    }
}