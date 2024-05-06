package team.college.database.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import team.college.database.model.entity.*;
import team.college.database.model.repository.CategoryRepository;

@Service
public class CategoryService {

        @Autowired
        private CategoryRepository categoryRepository;


        public void add(Category category) {
                categoryRepository.save(category);
        }

        public void update(Category category) {
                categoryRepository.save(category);
        }

        public void remove(Integer category_id) {
                categoryRepository.deleteById(category_id);
        }

        public Category get(Integer category_id) {
                return categoryRepository.findById(category_id).get();
        }
}