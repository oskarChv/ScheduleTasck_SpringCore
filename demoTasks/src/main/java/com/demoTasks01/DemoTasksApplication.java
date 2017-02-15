package com.demoTasks01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DemoTasksApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoTasksApplication.class, args);
	}
}
