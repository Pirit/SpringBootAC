package com.pxu.glitter.springbased.ch2.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class DemoListener implements ApplicationListener<DemoEvent> {

    public void onApplicationEvent(DemoEvent demoEvent) {
        String msg = demoEvent.getMsg();

        System.out.println("Bean-DemoListener has listened Bean-DemoPublisher msg: "+msg);
    }
}
