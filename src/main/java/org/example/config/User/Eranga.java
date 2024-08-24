package org.example.config.User;

import jakarta.annotation.PostConstruct;
import org.example.config.contact.goodGirl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Eranga {
    @Autowired
    goodGirl goodgirl;
    @PostConstruct
    public void init(){
        System.out.println(goodgirl);
        goodgirl.love();
    }
    public Eranga(){
        System.out.println(goodgirl);
    }
}
