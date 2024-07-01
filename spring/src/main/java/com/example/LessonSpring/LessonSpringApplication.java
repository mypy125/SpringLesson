package com.example.LessonSpring;

import com.example.LessonSpring.domain.entity.user.UserEntity;
import lombok.SneakyThrows;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@SpringBootApplication
public class LessonSpringApplication {

	public static void main(String[] args) {

		SpringApplication.run(LessonSpringApplication.class, args);

	}


}
