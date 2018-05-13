package com.pxu.glitter.springbased.ch3.aware;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class AwareService implements BeanNameAware, ResourceLoaderAware {

    private String beanName;
    private ResourceLoader loader;

    public void setBeanName(String s) {
        this.beanName = s;
    }

    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.loader = resourceLoader;
    }

    public void outputResult() {
        System.out.println("Bean's Name is : " + beanName);
        Resource resource = loader.getResource("classpath:com/pxu/glitter/springbased/ch3/aware/test.txt");
        try {
            System.out.println("RescourceLoader loading content : " + IOUtils.toString(resource.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
