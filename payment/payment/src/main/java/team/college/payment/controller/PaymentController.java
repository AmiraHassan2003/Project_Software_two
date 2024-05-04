package team.college.payment.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import team.college.payment.model.Payment;
import team.college.payment.service.PaymentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/payment")
public class PaymentController {
        // add payment
        // remove payment

        @Autowired
        private PaymentService paymentService;
        
        @PostMapping("/add")
        public void addPayment(@RequestBody Payment payment) {
                paymentService.addPayment(payment);
        }

        @GetMapping("/remove")
        public void removePayment(@RequestParam Integer payment_id) {
                paymentService.removePayment(payment_id);
        }
}
