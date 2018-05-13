package com.pxu.glitter.springbased.ch3.taskscheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class ScheduledTaskService {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime(){
        System.out.println("Run it at each 5 mins --> "+dateFormat.format(new Date()));
    }

    @Scheduled(cron = "0 25 21 ? * *")
    public void fixTimeExecution(){
        System.out.println("ar Special Time --> "+dateFormat.format(new Date())+" executed!");
    }

}
