package com.example.scheduletaskexample.Scheduled;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class ScheduledTasks {
    private static final Logger logger = LoggerFactory.getLogger(ScheduledTasks.class);

    @Scheduled(cron = "0 59 14 * * *")
    public void performTask() {
        try {
            logger.info("Task performed at {}", LocalDateTime.now());
            // Perform task logic
        } catch (Exception e) {
            logger.error("Error during task execution", e);
        }
    }
}