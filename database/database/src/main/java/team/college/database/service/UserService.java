package team.college.database.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import team.college.database.model.entity.*;
import team.college.database.model.repository.UserRepository;

@Service
public class UserService {

        @Autowired
        private UserRepository userRepository;

        public List<User> getAll() {
                return userRepository.findAll();
        }

        public void register(User user) {
                userRepository.save(user);
        }

        public void update(User user) {
                userRepository.save(user);
        }

        public List<Payment> getPayments(Integer user_id) {
                Optional<User> user = userRepository.findById(user_id);
                if (user.isPresent())
                        return user.get().payments;
                return null;
        }

        public List<Order> getOrders(Integer user_id) {
                Optional<User> user = userRepository.findById(user_id);
                if (user.isPresent())
                        return user.get().orders;
                return null;
        }
}
