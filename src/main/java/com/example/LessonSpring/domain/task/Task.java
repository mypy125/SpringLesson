package com.example.LessonSpring.domain.task;

import lombok.*;
import org.springframework.stereotype.Component;

import java.io.Serializable;


@Data
@Component
@AllArgsConstructor
@NoArgsConstructor
public class Task implements Serializable {
    private Long id;
    private String title;
    private String description;
//    private Status status;
//    private LocalDateTime expirationTime;
//    private List<String> images;

}
