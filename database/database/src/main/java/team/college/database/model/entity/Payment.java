package team.college.database.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@Table
@NoArgsConstructor
public class Payment {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Integer id;
        private Double price;
        private String method;
        @ManyToOne
        private User user;
}
