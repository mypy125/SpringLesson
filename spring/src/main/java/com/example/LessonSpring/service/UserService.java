package com.example.LessonSpring.service;

import com.example.LessonSpring.domain.entity.user.UserEntity;

import java.util.List;

public interface UserService {
    List<UserEntity> getAll();
    UserEntity getById(Long id);
    UserEntity create(UserEntity user);
    UserEntity update(UserEntity user);
    void delete(UserEntity user);
}
