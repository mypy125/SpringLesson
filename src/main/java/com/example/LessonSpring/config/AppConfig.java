package com.example.LessonSpring.config;

import com.example.LessonSpring.repository.TaskRepository;
import com.example.LessonSpring.repository.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    UserRepository userRepository(){
        return new UserRepository();
    }

    @Bean
    TaskRepository taskRepository(){
        return new TaskRepository();
    }
}
