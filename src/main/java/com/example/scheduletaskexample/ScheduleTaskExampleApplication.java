package com.example.scheduletaskexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class ScheduleTaskExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScheduleTaskExampleApplication.class, args);
    }

}
