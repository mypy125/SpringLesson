package com.example.LessonSpring.service;

import com.example.LessonSpring.domain.task.Task;

import java.util.List;

public interface TaskService {
    Task getById(Long id);
    List<Task> getAllByUserId(Long id);
    Task update(Task task);
    Task create(Task task);
    void delete(Long id);
}
