package com.pxu.glitter.springbased.ch1.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.pxu.glitter.springbased.ch1.aop")
@EnableAspectJAutoProxy
public class AopConfig {
}
