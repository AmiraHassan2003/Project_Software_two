package team.college.payment.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
public class User {
        private Integer id;
        private String name;
        private String email;
        private String password;
        public List<Order> orders;
        public List<Payment> payments;
}
