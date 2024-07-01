package com.example.LessonSpring.config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.util.Objects;

@Configuration
@RequiredArgsConstructor
@PropertySource("classpath:database.properties")
public class AppConfig {
    private final Environment environment;

    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setDriverClassName(Objects.requireNonNull(environment.getProperty("driver")));
        driverManagerDataSource.setUrl(environment.getProperty("url"));
        driverManagerDataSource.setUsername(environment.getProperty("username"));
        driverManagerDataSource.setPassword(environment.getProperty("password"));
        return driverManagerDataSource;
    }

    @Bean
    JdbcTemplate jdbcTemplate(){
        return new JdbcTemplate(dataSource());
    }
}
