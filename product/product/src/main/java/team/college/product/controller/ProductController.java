package team.college.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import team.college.product.model.Product;
import team.college.product.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
        
        // add product to system
        // update product in system
        // remove product from system
        // buy product
        // return product

        @Autowired
        private ProductService productService;

        @PostMapping("/create")
        public void createProduct(@RequestBody Product product) {
                productService.createProduct(product);
        }

        @PostMapping("/update")
        public void updateProduct(@RequestBody Product product) {
                productService.updateProduct(product);
        }

        @GetMapping("/{product_id}/remove")
        public void removeProduct(@PathVariable Integer product_id) {
                productService.removeProduct(product_id);
        }

        @GetMapping("/buy")
        public void buyProduct(@RequestParam Integer product_id, @RequestParam Integer order_id, @RequestParam Integer amount) {
                productService.buyProduct(product_id, order_id, amount);
        }

        @GetMapping("/cancel")
        public void cancelProduct(@RequestParam Integer product_id, @RequestParam Integer order_id) {
                productService.cancelProduct(product_id, order_id);
        }
}
