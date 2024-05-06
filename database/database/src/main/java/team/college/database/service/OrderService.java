package team.college.database.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import team.college.database.model.entity.*;
import team.college.database.model.repository.OrderRepository;

@Service
public class OrderService {

        @Autowired
        private OrderRepository orderRepository;

        public void add(Order order) {
                orderRepository.save(order);
        }

        public void update(Order order) {
                orderRepository.save(order);
        }

        public void remove(Integer order_id) {
                orderRepository.deleteById(order_id);
        }

        public Order get(Integer order_id) {
                return orderRepository.findById(order_id).get();
        }
}
