package com.example.LessonSpring.service;

import com.example.LessonSpring.domain.entity.task.TaskEntity;

import java.util.List;

public interface TaskService {
    List<TaskEntity> getAll();
    TaskEntity getById(Long id);
    TaskEntity create(TaskEntity task);
    TaskEntity update(TaskEntity task);
    void delete(Long id);
}
