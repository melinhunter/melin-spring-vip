package com.spring;

public class MelinApplicationContext {
    private Class configClass;

    public MelinApplicationContext(Class configClass) {
        this.configClass = configClass;
    }

    public Object getBean(String beanName) {
        return null;
    }
}
