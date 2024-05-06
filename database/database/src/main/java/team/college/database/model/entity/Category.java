package team.college.database.model.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
@Table
@Entity
public class Category {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Integer id;

        private String name;
        @JsonIgnore
        @OneToMany(mappedBy = "category")
        public List<Product> products;

}
