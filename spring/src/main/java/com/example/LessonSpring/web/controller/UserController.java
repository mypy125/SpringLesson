package com.example.LessonSpring.web.controller;

import com.example.LessonSpring.domain.entity.user.UserEntity;
import com.example.LessonSpring.service.UserService;
import com.example.LessonSpring.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }
    @GetMapping("users")
    public List<UserEntity> getAllUser(){
        return userService.getAll();
    }
    @GetMapping("/{id}")
    public UserEntity getUserById(@PathVariable Long id){
        return userService.getById(id);
    }

    @PostMapping("/users")
    public UserEntity createUser(@RequestBody UserEntity user ){
        return userService.create(user);
    }

    @PutMapping("/users")
    public UserEntity updateUser(@RequestBody UserEntity user){
        return userService.create(user);
    }

    @DeleteMapping("/{user}")
    public void deleteUser(@PathVariable UserEntity user){
        userService.delete(user);
    }
}
