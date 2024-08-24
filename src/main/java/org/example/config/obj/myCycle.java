package org.example.config.obj;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

//@Component("lifeCycle")
public class myCycle implements BeanNameAware, BeanFactoryAware, InitializingBean, ApplicationContextAware, DisposableBean {
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Bean factory is "+beanFactory);
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("name is "+ name);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("byeeeeeeeeeeeeeeeeeeeeeeeeee");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initializing Bean with after PropertySet");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("application Context is" +applicationContext);
    }
}
