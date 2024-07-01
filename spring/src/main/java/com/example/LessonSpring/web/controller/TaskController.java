package com.example.LessonSpring.web.controller;

import com.example.LessonSpring.domain.entity.task.TaskEntity;
import com.example.LessonSpring.service.TaskService;
import com.example.LessonSpring.service.impl.TaskServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    private final TaskService taskService;

    @Autowired
    public TaskController(TaskServiceImpl taskService) {
        this.taskService = taskService;
    }
    @GetMapping("/users")
    public List<TaskEntity> getAllTask(){
        return taskService.getAll();
    }
    @GetMapping("/{id}")
    public TaskEntity getTaskById(@PathVariable Long id){
        return taskService.getById(id);
    }


    @PostMapping("/tasks")
    public TaskEntity createTask(@RequestBody TaskEntity task){
       return taskService.create(task);
    }

    @PutMapping("/task")
    public TaskEntity updateTask(@RequestBody TaskEntity task){
        return taskService.update(task);
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id){
        taskService.delete(id);
    }
}
