package com.example.LessonSpring.web.controller;

import com.example.LessonSpring.domain.user.User;
import com.example.LessonSpring.repository.UserRepository;
import com.example.LessonSpring.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserServiceImpl service;

    @Autowired
    public UserController(UserServiceImpl service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id){
        return service.getById(id);
    }

    @GetMapping("/{name}")
    public User getUserByName(@PathVariable String name){
        return service.getByUserName(name);
    }

    @PostMapping("/users")
    public User createUser(@RequestBody User user ){
        return service.create(user);
    }

    @PutMapping("/users")
    public User updateUser(@RequestBody User user){
        return service.create(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id){
        service.delete(id);
    }
}
