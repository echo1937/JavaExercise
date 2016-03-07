package ch06.com.baobaotao.advice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAdvice1 {
    public static void main(String[] args) {
        String configPath = "ch06/com/baobaotao/advice/beans.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(configPath);
        Waiter waiter = (Waiter) ctx.getBean("waiter");
        waiter.greetTo("John");
    }
}
