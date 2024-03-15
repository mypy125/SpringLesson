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
        list.add(new User(5L,"stepa"));
        list.add(new User(6L,"artash"));
        list.add(new User(7L,"kartesh"));
        list.add(new User(8L,"veri"));
        list.add(new User(9L,"mark"));
        list.add(new User(10L,"maxim"));
        list.add(new User(11L,"sasha"));
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
