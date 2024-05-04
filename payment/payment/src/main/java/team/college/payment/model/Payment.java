package team.college.payment.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
public class Payment {
        private Integer id;
        private Double price;
        private String method;
        private Integer user_id;
}
