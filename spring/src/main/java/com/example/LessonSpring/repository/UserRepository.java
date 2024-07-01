package com.example.LessonSpring.repository;


import com.example.LessonSpring.domain.entity.user.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRepository extends JpaRepository<UserEntity,Long> {

}
