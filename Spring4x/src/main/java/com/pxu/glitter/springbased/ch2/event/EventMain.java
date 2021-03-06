package com.pxu.glitter.springbased.ch2.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EventMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);

        DemoPublisher demoPublisher = context.getBean(DemoPublisher.class);

        demoPublisher.publish("Hello application event!");

        context.close();
    }
}
