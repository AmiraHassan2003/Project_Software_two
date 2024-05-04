package team.college.category.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import team.college.category.model.Category;
import team.college.category.service.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController {


        @Autowired
        private CategoryService categoryService;

        @PostMapping("/add")
        public void addCategory(@RequestBody Category category) {
                categoryService.addCategory(category);
        }
        
        @PostMapping("/update")
        public void updateCategory(@RequestBody Category category) {
                categoryService.addCategory(category);
        }

        @GetMapping("/remove")
        public void removeCategory(@RequestParam Integer category_id) {
                categoryService.removeCategory(category_id);
        }

        @GetMapping("/get")
        public List<Integer> getCategory(@RequestParam Integer category_id) {
                return categoryService.getCategory(category_id);
        }
}
