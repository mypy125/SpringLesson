package com.example.LessonSpring.repository;

import com.example.LessonSpring.domain.entity.task.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<TaskEntity, Long> {

}
