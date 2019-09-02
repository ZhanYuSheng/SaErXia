package com.codecraft.tinyioc;

public class BeanDefinition {

    private Object bean;

    private String beanClassName;

    private Class beanClass;

    private PropertyValues propertyValues;

    void BeanDefinition(){
    }

    public Object getBean() {
        return bean;
    }

    public void setBean(Object bean) {
        this.bean = bean;
    }

    public String getBeanClassName() {
        return beanClassName;
    }

    public void setBeanClassName(String beanClassName) {
        try {
            this.beanClass = Class.forName(beanClassName);
            this.beanClassName = beanClassName;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }

    public PropertyValues getPropertyValues() {
        return propertyValues;
    }

    public void setPropertyValues(PropertyValues propertyValues) {
        this.propertyValues = propertyValues;
    }
}
