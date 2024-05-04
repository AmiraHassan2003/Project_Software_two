package team.college.order.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.util.UriComponentsBuilder;

import team.college.order.model.Order;

@Service
public class OrderService {

        private final String URL = "http://localhost:8080/order/";
        private final org.springframework.web.client.RestTemplate restTemplate;
        private final org.springframework.http.HttpHeaders httpHeaders;
    
        public OrderService(org.springframework.web.client.RestTemplate restTemplate) {
                this.restTemplate = restTemplate;
                this.httpHeaders = new org.springframework.http.HttpHeaders();
        }

        public void addOrder(Order order) {
                if (order.getUser_id() == null)
                {
                        return;
                }
                httpHeaders.setContentType(org.springframework.http.MediaType.APPLICATION_JSON);
                org.springframework.http.HttpEntity<Order> request = new org.springframework.http.HttpEntity<>(order, httpHeaders);
                restTemplate.postForObject(URL + "add", request, Order.class);
        }

        public void updateOrder(Order order) {
                if (order.getId() == null)
                {
                        return;
                }
                httpHeaders.setContentType(org.springframework.http.MediaType.APPLICATION_JSON);
                org.springframework.http.HttpEntity<Order> request = new org.springframework.http.HttpEntity<>(order, httpHeaders);
                restTemplate.postForObject(URL + "update", request, Order.class);
        }

        public void removeOrder(Integer order_id) {
                UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(URL + "remove")
                .queryParam("order_id", order_id);
                restTemplate.getForObject(builder.toUriString(), Void.class);
        }

        @SuppressWarnings("unchecked")
        public List<Integer> getOrder(Integer order_id) {
                UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(URL + "get")
                .queryParam("order_id", order_id);
                return restTemplate.getForObject(builder.toUriString(), List.class);
        }
}
