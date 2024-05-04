package team.college.user.model;

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
        public List<Integer> orders_id;
        public List<Integer> payment_id;
}