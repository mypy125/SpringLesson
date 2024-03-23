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

	@SneakyThrows
	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(LessonSpringApplication.class, args);

//		DataSource dataSource = context.getBean(DataSource.class);
//		try(Connection connection = dataSource.getConnection()){
//			try(Statement statement = connection.createStatement()){
//				statement.execute("create table users(id bigint, name varchar(512))");
//			}
//			try(Statement statement = connection.createStatement()){
//				statement.execute("insert into users(id, name) values(1, 'Костя')");
//			}
//			try(Statement statement = connection.createStatement()){
//				ResultSet resultSet = statement.executeQuery("select * from users");
//				while (resultSet.next()){
//					System.out.println(resultSet.getLong("id"));
//					System.out.println(resultSet.getString("name"));
//				}
//			}
//		}

		JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);
		jdbcTemplate.execute("create table users(id bigint, name varchar(512), password varchar(512))");
		jdbcTemplate.execute("insert into users(id, name, password) values(1, 'Костя','123456')");

		List<UserEntity> userList = jdbcTemplate.query("select * from users", new RowMapper<UserEntity>() {
			@Override
			public UserEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
				return new UserEntity(rs.getLong("id"),rs.getString("name"), rs.getString("password") );
			}
		});
		System.out.println(userList);
	}

}
