package com.pxu.glitter.springbased.ch2.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ScopeMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);

        DemoSingletonService s1 = context.getBean(DemoSingletonService.class);
        DemoSingletonService s2 = context.getBean(DemoSingletonService.class);

        DemoPrototypeService p1 = context.getBean(DemoPrototypeService.class);
        DemoPrototypeService p2 = context.getBean(DemoPrototypeService.class);

        System.out.println("S1 = S2 ? -->"+s1.equals(s2));
        System.out.println("P1 = P2 ? -->"+p1.equals(p2));
        context.close();

    }
}
