package team.college.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import team.college.user.model.User;
import team.college.user.service.UserService;
import org.springframework.web.bind.annotation.RequestParam;


//http://localhost:8081/user
@RestController
@RequestMapping("/user")
public class UserController {

        @Autowired
        private UserService userService;

        @PostMapping("/register")
        public User createUser(@RequestBody User user) {
                return user = userService.createUser(user);
        }

        @PostMapping("/login")
        public User loginUser(@RequestBody User user) {
                return userService.loginUser(user);
        }

        @PostMapping("/update")
        public User updateUser(@RequestBody User user) {
                return userService.updateUser(user);
        }

        // @GetMapping("/{user_id}/add")
        // public Integer addOrder(@RequestParam Integer orderId, @PathVariable Integer user_id) {
        //         userService.addOrder(user_id, orderId);
        //         return user_id;
        // }

        // @GetMapping("/{user_id}/remove")
        // public Integer removeOrder(@RequestParam Integer orderId, @PathVariable Integer user_id) {
        //         userService.removeOrder(user_id, orderId);
        //         return user_id;
        // }

        @GetMapping("/")
        public List<User> all_Users() {
                return userService.allUsers();
        }

        @GetMapping("/{user_id}/orders")
        public List<Integer> all_OrderIds(@PathVariable Integer user_id) {
                return userService.userOrders(user_id);
        }

        @GetMapping("/{user_id}/payments")
        public List<Integer> all_PaymentsIds(@PathVariable Integer user_id) {
                return userService.userOrders(user_id);
        }

        @GetMapping("/get")
        public User getUser(@RequestParam Integer user_id) {
                return new User();
        }
        
}
