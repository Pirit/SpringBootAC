package com.pxu.glitter.springbased.ch2.prepost;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class JSR250WayService {

    @PostConstruct
    public void init() {
        System.out.println("jsr250-init-method");
    }

    public JSR250WayService() {
        super();
        System.out.println("Init-Construction --> BeanWayService");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("jsr250-destory-method");
    }
}
