package com.pxu.glitter.springbased.ch1.javaconfig;


public class UserFunctionService {

    FunctionService functionService;

    public void setFunctionService(FunctionService functionService) {
        this.functionService = functionService;
    }

    public String sayHello(String word) {
        return functionService.seyHello(word);
    }
}
