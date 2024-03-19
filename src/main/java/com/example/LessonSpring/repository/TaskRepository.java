package com.example.LessonSpring.repository;

import com.example.LessonSpring.domain.task.Task;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Repository
public class TaskRepository {
    private final List<Task> list;

    public TaskRepository(){
        this.list = new ArrayList<>();
        list.add(new Task(1L,"home","prikrutit lampuchku"));
        list.add(new Task(2L,"work","nayti rabotu"));
        list.add(new Task(3L,"development","writhe code"));
        list.add(new Task(4L,"programing","create taco-cloud app"));
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

    public Task updateTask(Task task){
        List<Task> updateT = list.stream().map(t -> {
            if(t.getId().equals(task.getId())) {
                t.setId(task.getId());
                t.setTitle(task.getTitle());
                t.setDescription(task.getDescription());
            }
            return t;
        }).collect(Collectors.toList());
        return (Task) updateT;
    }

    public Task createTask(Task task){
        list.add(task);
        return getTaskById(task.getId());
    }
    public void deleteTask(Long id){
        List<Task> deleteUser = list.stream().filter(t -> !t.getId().equals(id)).toList();
    }
}
