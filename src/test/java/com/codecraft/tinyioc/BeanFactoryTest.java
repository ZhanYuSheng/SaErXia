package com.codecraft.tinyioc;

import com.codecraft.tinyioc.factory.AutowireCapatableBeanFactory;
import com.codecraft.tinyioc.factory.BeanFactory;
import org.junit.Test;

public class BeanFactoryTest {

    @Test
    public void test() throws Exception {
        BeanFactory beanFactory = new AutowireCapatableBeanFactory();

        BeanDefinition beanDefinition = new BeanDefinition();
        beanDefinition.setBeanClassName("com.codecraft.tinyioc.HelloWorldService");
        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("text", "和谁都五五开"));
        propertyValues.addPropertyValue(new PropertyValue("name", "卡卡西"));
        beanDefinition.setPropertyValues(propertyValues);
        beanFactory.registerBeanDefinition("helloWorldService", beanDefinition);

        HelloWorldService helloWorldService = (HelloWorldService)beanFactory.getBean("helloWorldService");
        helloWorldService.saySomething();
    }

}
