package com.pxu.glitter.springbased.ch1.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.pxu.glitter.springbased.ch1.javaconfig")
public class JavaConfig {

    @Bean
    public FunctionService functionService(){
        return new FunctionService();
    }

//    @Bean
//    public UserFunctionService userFunctionService(){
//        UserFunctionService userFunctionService = new UserFunctionService();
//        userFunctionService.setFunctionService(functionService());
//        return userFunctionService;
//    }
    @Bean
    public UserFunctionService userFunctionService(FunctionService functionService){
        UserFunctionService userFunctionService = new UserFunctionService();
        userFunctionService.setFunctionService(functionService);
        return userFunctionService;
    }
}
