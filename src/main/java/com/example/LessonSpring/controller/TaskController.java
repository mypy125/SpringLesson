package com.example.LessonSpring.controller;

import com.example.LessonSpring.domain.task.Task;
import com.example.LessonSpring.repository.TaskRepository;
import com.example.LessonSpring.service.impl.TaskServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    private final TaskServiceImpl service;

    @Autowired
    public TaskController(TaskServiceImpl service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public Task getUserById(@PathVariable Long id){
        return service.getById(id);
    }


    @PostMapping("/tasks")
    public Task createTask(@RequestBody Task task){
       return service.create(task);
    }

    @PutMapping("/task")
    public Task updateTask(@RequestBody Task task){
        return service.update(task);
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id){
        service.delete(id);
    }
}
