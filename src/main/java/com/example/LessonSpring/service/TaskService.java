package com.example.LessonSpring.service;

import com.example.LessonSpring.domain.task.Task;
import org.springframework.stereotype.Component;

import java.util.List;

public interface TaskService {
    Task getById(Long id);
    List<Task> getAllByUserId(Long id);
    Task update(Task task);
    Task create(Task task, Long id);
    void delete(Long id);
}
