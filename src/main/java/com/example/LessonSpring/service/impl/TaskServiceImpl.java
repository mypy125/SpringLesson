package com.example.LessonSpring.service.impl;

import com.example.LessonSpring.domain.entity.task.TaskEntity;
import com.example.LessonSpring.repository.TaskRepository;
import com.example.LessonSpring.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskServiceImpl implements TaskService {
    private final TaskRepository taskRepository;

    @Override
    public List<TaskEntity> getAll() {
        return null;
    }

    @Override
    public TaskEntity getById(Long id) {
        return null;
    }

    @Override
    public TaskEntity create(TaskEntity task) {
        return null;
    }

    @Override
    public TaskEntity update(TaskEntity task) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
