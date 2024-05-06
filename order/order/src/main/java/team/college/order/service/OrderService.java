package team.college.order.service;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.util.UriComponentsBuilder;
import team.college.order.model.Order;
import team.college.order.model.Product;

public interface OrderService {
    public void addOrder(Order order);
    public void updateOrder(Order order);
    public void removeOrder(Integer order_id);
    public Order getOrder(Integer order_id);
}
