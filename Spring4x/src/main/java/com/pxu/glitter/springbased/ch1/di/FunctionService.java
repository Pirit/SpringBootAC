package com.pxu.glitter.springbased.ch1.di;

import org.springframework.stereotype.Service;

@Service
public class FunctionService {
    public String seyHello(String word) {
        return "Hello " + word + " !";
    }
}
