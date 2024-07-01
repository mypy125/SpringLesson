package com.example.LessonSpring.domain.entity.task;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(schema = "task")
public class TaskEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
//    private Status status;
//    private LocalDateTime expirationTime;
//    private List<String> images;

}
