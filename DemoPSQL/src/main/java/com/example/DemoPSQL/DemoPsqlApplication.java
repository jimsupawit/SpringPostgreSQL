package com.example.DemoPSQL;

import com.example.DemoPSQL.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
public class DemoPsqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoPsqlApplication.class, args);
	}
}
