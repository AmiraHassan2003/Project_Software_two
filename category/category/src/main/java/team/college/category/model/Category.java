package team.college.category.model;


import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor

public class Category {
        private Integer id;
        private String name;
        @JsonIgnore
        public List<Product> products;
}
