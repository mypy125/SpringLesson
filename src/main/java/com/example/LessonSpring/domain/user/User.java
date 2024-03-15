package com.example.LessonSpring.domain.user;

import com.example.LessonSpring.domain.task.Task;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Component
public class User implements Serializable {
    private Long id;
    private String name;
//    private String username;
//    private String password;
//    private String passwordConfirmation;
//    private Set<Role> roles;
//    private List<Task> tasks;
}
