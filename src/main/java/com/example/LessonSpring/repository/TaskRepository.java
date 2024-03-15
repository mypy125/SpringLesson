package com.example.LessonSpring.repository;

import com.example.LessonSpring.domain.task.Task;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class TaskRepository {
    private final List<Task> list;

    public TaskRepository(){
        this.list = new ArrayList<>();
        list.add(new Task(1L,"home"));
        list.add(new Task(2L,"work"));
        list.add(new Task(3L,"development"));
        list.add(new Task(4L,"programing"));
    }
    public List<Task> getAllTask(){
        return List.copyOf(list);
    }

    public Task getTaskById(Long id){
        return list.stream().filter(t -> t.getId().equals(id)).findFirst().orElse(null);
    }

    public Task getTaskByTitle(String title){
        return list.stream().filter(t -> t.getTitle().equals(title)).findFirst().orElse(null);
    }
}
