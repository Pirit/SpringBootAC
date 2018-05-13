package com.pxu.glitter.springbased.ch3.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfig.class);

        DemoService demoService = context.getBean(DemoService.class);
        demoService.outputResult();

        context.close();
    }
}
