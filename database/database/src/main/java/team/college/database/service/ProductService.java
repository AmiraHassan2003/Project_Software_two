package team.college.database.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import team.college.database.model.entity.*;
import team.college.database.model.repository.OrderProductRepository;
import team.college.database.model.repository.OrderRepository;
import team.college.database.model.repository.ProductRepository;

@Service
public class ProductService {


        @Autowired
        private ProductRepository productRepository;
        @Autowired
        private OrderProductRepository orderProductRepository;
        @Autowired
        private OrderRepository orderRepository;


        public Product create(Product product) {
                productRepository.save(product);
                return product;
        }

        public Product update(Product product) {
                productRepository.save(product);
                return product;
        }

        public void removeProduct(Integer product_id) {
                productRepository.deleteById(product_id);
        }

        public Boolean buyProduct(Integer product_id, Integer order_id, Integer amount) {
                Optional<Product> info = productRepository.findById(product_id);
                if (!productRepository.findById(product_id).isPresent()) return false;
                if (!orderRepository.findById(order_id).isPresent()) return false;
                if (info.isPresent())
                {
                        if (amount > info.get().getAmount())
                                return false;
                        else {
                                info.get().setAmount(info.get().getAmount() - amount);
                                productRepository.save(info.get());
                                OrderProduct orderProduct = new OrderProduct();
                                orderProduct.setAmount(amount);
                                orderProduct.setOrder(orderRepository.findById(order_id).get());
                                orderProduct.setProduct(productRepository.findById(product_id).get());
                                orderProductRepository.save(orderProduct);
                                return true;
                        }
                }
                return false;
        }

        public boolean cancelProduct(Integer product_id, Integer order_id) {
                List<OrderProduct> orderProducts = orderProductRepository.findAll();
                for (OrderProduct orderProduct : orderProducts) {
                        if (orderProduct.getOrder().getId() == order_id && orderProduct.getProduct().getId() == product_id)
                        {
                                orderProductRepository.delete(orderProduct);
                                return true;
                        }
                }
                return false;
        }
}
