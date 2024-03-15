package com.example.LessonSpring.service;

import com.example.LessonSpring.domain.user.User;

public interface UserService {
    User getById(Long id);
    User getByUserName(String username);
    User create(User user);
    User update(User user);
    boolean isTaskOwner(Long userId, Long taskId);
    void delete(Long id);
}
