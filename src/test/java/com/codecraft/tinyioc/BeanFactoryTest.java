package com.codecraft.tinyioc;

import com.codecraft.tinyioc.factory.AutowireCapatableBeanFactory;
import com.codecraft.tinyioc.factory.BeanFactory;
import org.junit.Test;

public class BeanFactoryTest {

    @Test
    public void test(){
        BeanFactory beanFactory = new AutowireCapatableBeanFactory();

        BeanDefinition beanDefinition = new BeanDefinition();
        beanDefinition.setBeanClassName("com.codecraft.tinyioc.HelloWorldService");
        beanFactory.registerBeanDefinition("helloWorldService", beanDefinition);

        HelloWorldService helloWorldService = (HelloWorldService)beanFactory.getBean("helloWorldService");
        helloWorldService.sayHello();
    }

}
