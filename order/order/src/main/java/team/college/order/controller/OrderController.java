package team.college.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import team.college.order.model.Order;
import team.college.order.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {

        @Autowired
        private OrderService orderService;

        @PostMapping("/add")
        public void addOrder(@RequestBody Order order) {
                orderService.addOrder(order);
        }

        @PostMapping("/update")
        public void updateOrder(@RequestBody Order order) {
                orderService.addOrder(order);
        }
        
        @GetMapping("/remove")
        public void removeOrder(@RequestParam Integer order_id) {
                orderService.removeOrder(order_id);
        }
        
        @GetMapping("/get")
        public List<Integer> getOrder(@RequestParam Integer order_id) {
                return orderService.getOrder(order_id);
        }

}
