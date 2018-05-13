package com.pxu.glitter.springbased.ch3.annotation;

import org.springframework.stereotype.Service;

@Service
public class DemoService {

    public void outputResult(){
        System.out.println("Get Bean from annotation group!");
    }
}
