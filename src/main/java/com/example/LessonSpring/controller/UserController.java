package com.example.LessonSpring.controller;

import com.example.LessonSpring.domain.user.User;
import com.example.LessonSpring.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserRepository repository;

    @Autowired
    public UserController(UserRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id){
        return repository.getUserById(id);
    }

    @GetMapping("/{name}")
    public User getUserByName(@PathVariable String name){
        return repository.getUserByName(name);
    }

}
