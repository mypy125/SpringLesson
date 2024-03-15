package com.example.LessonSpring.service.impl;

import com.example.LessonSpring.domain.task.Task;
import com.example.LessonSpring.repository.TaskRepository;
import com.example.LessonSpring.repository.UserRepository;
import com.example.LessonSpring.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {
    private final TaskRepository taskRepository;

    @Autowired
    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Task getById(Long id) {
        return taskRepository.getTaskById(id);
    }

    @Override
    public List<Task> getAllByUserId(Long id) {
        return taskRepository.getAllTask();
    }

    @Override
    public Task update(Task task) {
        return null;
    }

    @Override
    public Task create(Task task, Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
