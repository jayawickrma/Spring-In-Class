package org.example.config.config;

import org.example.config.obj.Obj2;
import org.example.config.obj.myCycle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackageClasses = myCycle.class)
@ComponentScan(basePackages = "org.example.config")
public class Config {
//    @Bean
//    Obj2 obj2(){
//        return new Obj2();
//    }
}
