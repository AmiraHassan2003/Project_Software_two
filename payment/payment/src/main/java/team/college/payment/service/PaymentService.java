package team.college.payment.service;

import org.springframework.web.util.UriComponentsBuilder;
import team.college.payment.model.Payment;

public interface PaymentService {
    public void addPayment(Payment payment);
    public void removePayment(Integer payment_id);
}
