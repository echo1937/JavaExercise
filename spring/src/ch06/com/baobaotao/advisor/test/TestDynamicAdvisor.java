package ch06.com.baobaotao.advisor.test;

import ch06.com.baobaotao.advisor.Waiter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDynamicAdvisor {
    public static void main(String[] args) {
        String configPath = "ch06/com/baobaotao/advisor/beans.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(configPath);
        Waiter waiter = (Waiter) ctx.getBean("waiter2");
        waiter.serveTo("Peter");
        waiter.greetTo("Peter");
        waiter.serveTo("Peter");
        waiter.greetTo("John");
    }
}
