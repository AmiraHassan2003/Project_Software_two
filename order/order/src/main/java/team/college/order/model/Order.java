package team.college.order.model;


import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor

public class Order {
        private Integer id;
        private User user;
        private String date;
        private String address;
        private Double totalCost;
        public List<OrderProduct> orderProducts;
}
