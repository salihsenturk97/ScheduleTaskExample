package com.example.scheduletaskexample.Scheduled;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.LocalDateTime;


@Component
public class ProgrammaticallyScheduledTasks {
    private final TaskScheduler taskScheduler;
    private static final Logger logger = LoggerFactory.getLogger(ProgrammaticallyScheduledTasks.class);

    @Autowired
    public ProgrammaticallyScheduledTasks(TaskScheduler taskScheduler) {
        this.taskScheduler = taskScheduler;
        scheduleTask();
    }

    public void scheduleTask() {
        Runnable task = () -> logger.info("Programmatically scheduled task performed at {}", LocalDateTime.now());
        taskScheduler.scheduleWithFixedDelay(task, Duration.ofSeconds(5));
    }
}