package org.example.config.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class logs {
    @After("execution( public void startTransaction())")
    public static void startTranslogs(){
        System.out.println("stated log");
    }
    @After("execution(public void endTransaction())")
    public static void endtranslogs(){}
}
