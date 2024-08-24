package org.example.config.Beans;

import org.example.config.contact.goodGirl;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier("long hair")
public class piumi implements goodGirl {
    @Override
    public void love() {
        System.out.println("love you eranga baba");
        System.out.println("love you eranga baba");
    }
}
