package com.example.DemoPSQL.student;


import com.example.DemoPSQL.Repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.util.Calendar.DECEMBER;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student jimmy = new Student(
                    "Jimmy",
                    "jimmy@gmail.com",
                    LocalDate.of(2000, DECEMBER, 28),
                    22
            );
            Student Test = new Student(
                    "Test",
                    "Test@gmail.com",
                    LocalDate.of(2004, DECEMBER, 25),
                    22
            );

            repository.saveAll(
                    List.of(jimmy,Test)
            );
        };
    }
}
