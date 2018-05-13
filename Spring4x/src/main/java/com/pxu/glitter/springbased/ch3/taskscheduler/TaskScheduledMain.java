package com.pxu.glitter.springbased.ch3.taskscheduler;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TaskScheduledMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskSchedulerConfig.class);
    }
}
