package com.example.LessonSpring.repository;

import com.example.LessonSpring.domain.user.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@AllArgsConstructor
@Repository
public class UserRepository {
    private final List<User> list;

    public UserRepository(){
        this.list = new ArrayList<>();
        list.add(new User(1L,"stepa","st"));
        list.add(new User(2L,"karen","kar"));
        list.add(new User(3L,"sevak","svo"));
        list.add(new User(4L,"gregory","gev"));
        list.add(new User(5L,"stepan","sev"));
        list.add(new User(6L,"artash","akash"));
        list.add(new User(7L,"kartesh","kash"));
        list.add(new User(8L,"veri","vi"));
        list.add(new User(9L,"mark","mak"));
        list.add(new User(10L,"maxim","max"));
        list.add(new User(11L,"sasha","sos"));
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

    public User getByUserName(String uName){
        return list.stream().filter(s -> s.getUsername().equals(uName)).findFirst().orElse(null);
    }

    public User createUser(User user ){
        list.add(user);
        return getUserById(user.getId());
    }

    public User updateUser(User user){
       List <User> updatedUsers = list.stream().map(u -> {
            if(u.getId().equals(user.getId())){
                u.setId(user.getId());
                u.setName(user.getName());
                u.setUsername(user.getUsername());
            }
            return u;
        }).collect(Collectors.toList());
        return (User)updatedUsers;
    }

    public void deleteUser(User user){
        List<User> deleteUser = list.stream().filter(u -> !u.getId().equals(user.getId())).toList();
    }
}
