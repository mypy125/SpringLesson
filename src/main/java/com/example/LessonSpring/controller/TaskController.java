package com.example.LessonSpring.controller;

import com.example.LessonSpring.domain.task.Task;
import com.example.LessonSpring.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    private final TaskRepository repository;

    @Autowired
    public TaskController(TaskRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/{id}")
    public Task getUserById(@PathVariable Long id){
        return repository.getTaskById(id);
    }

    @GetMapping("/{title}")
    public Task getUserByName(@PathVariable String title){
        return repository.getTaskByTitle(title);
    }

}
