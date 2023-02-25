package com.spring;

public class MelinApplicationContext {
    private Class configClass;

    public MelinApplicationContext(Class configClass) {
        this.configClass = configClass;

        //掃瞄
        if(configClass.isAnnotationPresent(ComponentScan.class)){
            ComponentScan componentScanAnnotation = (ComponentScan) configClass.getAnnotation(ComponentScan.class);
            String scanPath = componentScanAnnotation.value();
            System.out.println(scanPath);
        }
    }

    public Object getBean(String beanName) {
        return null;
    }
}
