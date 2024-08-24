package org.example.config.Beans;

import org.example.config.contact.goodGirl;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Kavindi implements goodGirl {
    public void love(){
        System.out.println("love you eranga");
        System.out.println("love you eranga");
        System.out.println("love you eranga");
        System.out.println("love you eranga");
        System.out.println("love you eranga");
    }
}
