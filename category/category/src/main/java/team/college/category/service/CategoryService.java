package team.college.category.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.util.UriComponentsBuilder;

import team.college.category.model.Category;

@Service
public class CategoryService {

        private final String URL = "http://localhost:8080/category/";
        private final org.springframework.web.client.RestTemplate restTemplate;
        private final org.springframework.http.HttpHeaders httpHeaders;
    
        public CategoryService(org.springframework.web.client.RestTemplate restTemplate) {
                this.restTemplate = restTemplate;
                this.httpHeaders = new org.springframework.http.HttpHeaders();
        }


        public void addCategory(Category category) {
                if (category.getName() == null) return;
                httpHeaders.setContentType(org.springframework.http.MediaType.APPLICATION_JSON);
                org.springframework.http.HttpEntity<Category> request = new org.springframework.http.HttpEntity<>(category, httpHeaders);
                restTemplate.postForObject(URL + "add", request, Category.class);
        }

        public void updateCategory(Category category) {
                if (category.getId() == null) return;
                httpHeaders.setContentType(org.springframework.http.MediaType.APPLICATION_JSON);
                org.springframework.http.HttpEntity<Category> request = new org.springframework.http.HttpEntity<>(category, httpHeaders);
                restTemplate.postForObject(URL + "update", request, Category.class);
        }

        public void removeCategory(Integer category_id) {
                UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(URL + "remove")
                .queryParam("category_id", category_id);
                restTemplate.getForObject(builder.toUriString(), Void.class);
        }

        @SuppressWarnings("unchecked")
        public List<Integer> getCategory(Integer category_id) {
                UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(URL + "get")
                .queryParam("category_id", category_id);
                return restTemplate.getForObject(builder.toUriString(), List.class);
        }


}
