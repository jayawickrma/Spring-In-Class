package org.example.config;

import org.example.config.config.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class appInit {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
        annotationConfigApplicationContext.register(Config.class);
        annotationConfigApplicationContext.refresh();
    }
}
