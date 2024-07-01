package com.example.LessonSpring.domain.entity.user;


import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(schema = "users")
public class UserEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String password;
//    private String passwordConfirmation;
//    private Set<Role> roles;
//    private List<Task> tasks;
}
