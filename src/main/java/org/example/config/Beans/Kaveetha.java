package org.example.config.Beans;

import org.example.config.contact.goodGirl;
import org.springframework.stereotype.Component;

@Component
public class Kaveetha implements goodGirl {
    @Override
    public void love() {
        System.out.println("love you eranga");
    }
}
