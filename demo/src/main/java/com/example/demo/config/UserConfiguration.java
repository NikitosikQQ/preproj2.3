package com.example.demo.config;

import com.example.demo.user.User;
import com.example.demo.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class UserConfiguration {

    @Bean
    CommandLineRunner commandLineRunner(UserRepository userRepository) {
        return args -> {
            User user1 = new User("Nikita", "Nikita@mail.ru", 22);
            User user2 = new User("Alexander", "Alexander@mail.ru", 20);
            User user3 = new User("Tolya", "Tolya@mail.ru", 100);
            User user4 = new User("Maria", "Maria@mail.ru", 20);
            User user5 = new User("Glina", "Glina@mail.ru", 34);
            userRepository.saveAll(List.of(user1, user2, user3, user4, user5));
        };
    }
}
