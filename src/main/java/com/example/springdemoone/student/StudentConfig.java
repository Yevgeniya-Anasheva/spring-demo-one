package com.example.springdemoone.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.DECEMBER;
import static java.time.Month.SEPTEMBER;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student yevgeniya = new Student(
                    "Yevgeniya",
                    "yevgeniya@gmail.com",
                    LocalDate.of(1998, SEPTEMBER, 1)
            );
            Student alex = new Student(
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(2001, DECEMBER, 5)
            );

            repository.saveAll(
                    List.of(yevgeniya, alex)
            );
        };
    }
}
