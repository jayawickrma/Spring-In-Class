package org.example.config.User;

import jakarta.annotation.PostConstruct;
import org.example.config.contact.goodGirl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Eranga {

    private goodGirl goodgirl;
    @PostConstruct
    public void init(){
        System.out.println(goodgirl);
        goodgirl.love();
    }
    @Autowired
    @Qualifier("long hair")
    public void setGoodgirl(goodGirl goodgirl){
        this.goodgirl=goodgirl;
    }
//    @Autowired
//    public Eranga(goodGirl goodgirl){
//        this.goodgirl = goodgirl;
//    }
}
