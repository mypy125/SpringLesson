package com.example.LessonSpring.repository;

import com.example.LessonSpring.domain.user.User;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@AllArgsConstructor
@Repository
public class UserRepository {
    private final List<User> list;

    public UserRepository(){
        this.list = new ArrayList<>();
        list.add(new User(1L,"stepa"));
        list.add(new User(2L,"karen"));
        list.add(new User(3L,"sevak"));
        list.add(new User(4L,"gregory"));
    }

    public List<User> getAllUsers(){
        return List.copyOf(list);
    }

    public User getUserById(Long id){
        return list.stream().filter(s -> s.getId().equals(id)).findFirst().orElse(null);
    }

    public User getUserByName(String name){
        return list.stream().filter(s -> s.getName().equals(name)).findFirst().orElse(null);
    }
}
