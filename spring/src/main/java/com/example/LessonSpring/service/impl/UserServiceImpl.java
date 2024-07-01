package com.example.LessonSpring.service.impl;

import com.example.LessonSpring.domain.entity.user.UserEntity;
import com.example.LessonSpring.repository.UserRepository;
import com.example.LessonSpring.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;


    @Override
    public List<UserEntity> getAll() {
        return userRepository.findAll();
    }

    @Override
    public UserEntity getById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public UserEntity create(UserEntity user) {
        return userRepository.save(user);
    }

    @Override
    public UserEntity update(UserEntity user) {
        return userRepository.save(user);
    }

    @Override
    public void delete(UserEntity user) {
        userRepository.delete(user);
    }
}
