package ie.atu.week11example;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name="payment-service", url="http://localhost:8081/payment")
public interface PaymentClient {
}
