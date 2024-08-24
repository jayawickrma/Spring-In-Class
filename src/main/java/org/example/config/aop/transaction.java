package org.example.config.aop;

import org.springframework.stereotype.Component;

@Component("trans")
public class transaction {
    public void startTransaction(){
        System.out.println("transaction started");
    }
    public void endTransaction(){
        System.out.println("transaction ended");
    }
}
