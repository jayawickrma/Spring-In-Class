package org.example.config;

import org.example.config.config.Config;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class appInit {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
        annotationConfigApplicationContext.register(Config.class);
        annotationConfigApplicationContext.refresh();

        Object obj2 = annotationConfigApplicationContext.getBean("obj2");
        System.out.println(obj2);

        ConfigurableListableBeanFactory configurableListableBeanFactory=annotationConfigApplicationContext.getBeanFactory();
        System.out.println("Is bean singleton" +configurableListableBeanFactory.isSingleton("myObj"));

        annotationConfigApplicationContext.registerShutdownHook();
    }
}
