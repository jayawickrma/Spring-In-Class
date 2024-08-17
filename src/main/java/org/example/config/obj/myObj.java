package org.example.config.obj;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class myObj {
    public myObj(){
        System.out.println("hellow spring");
    }
}
