package team.college.database.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import team.college.database.model.entity.*;
import team.college.database.model.repository.*;

@Service
public class PaymentService {

        @Autowired
        private PaymentRepository paymentRepository;

        public void add(Payment payment) {
                paymentRepository.save(payment);
        }

        public Boolean remove(Integer payment_id) {
                if (paymentRepository.findById(payment_id).isPresent())
                {
                        paymentRepository.deleteById(payment_id);
                        return true;
                }
                return false;
        }
        
}
