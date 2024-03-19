package com.example.LessonSpring.service.impl;

import com.example.LessonSpring.domain.user.User;
import com.example.LessonSpring.repository.UserRepository;
import com.example.LessonSpring.service.UserService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User getById(Long id) {
        return userRepository.getUserById(id);
    }

    @Override
    public User getByUserName(String username) {
        return userRepository.getUserByName(username);
    }

    @Override
    public User create(User user) {
        return userRepository.createUser(user);
    }

    @Override
    public User update(User user) {
        return userRepository.updateUser(user);
    }

    @Override
    public boolean isTaskOwner(Long userId, Long taskId) {
        return false;
    }

    @Override
    public void delete(Long id) {

    }
}
