package org.example.config.Beans;

import org.example.config.contact.goodGirl;
import org.example.config.info.nail;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier("long hair")
@nail
public class vimansa implements goodGirl {
    @Override
    public void love() {
        System.out.println("love you eranga and let's go ugandaaa.");
    }
}
