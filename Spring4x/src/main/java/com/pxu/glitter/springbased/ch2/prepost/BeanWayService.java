package com.pxu.glitter.springbased.ch2.prepost;

public class BeanWayService {

    public void init(){
        System.out.println("@Bean-init-method");
    }

    public BeanWayService(){
        super();
        System.out.println("Init-Construction --> BeanWayService");
    }

    public void destroy(){
        System.out.println("@Bean-destory-method");
    }

}
