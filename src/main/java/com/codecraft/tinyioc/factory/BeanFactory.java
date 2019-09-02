package com.codecraft.tinyioc.factory;

import com.codecraft.tinyioc.BeanDefinition;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public interface BeanFactory {

    public Object getBean(String beanName);

    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) throws Exception;
}
