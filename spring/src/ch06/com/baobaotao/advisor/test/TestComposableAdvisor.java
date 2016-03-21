package ch06.com.baobaotao.advisor.test;

import ch06.com.baobaotao.advisor.Waiter;
import ch06.com.baobaotao.advisor.WaiterDelegate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestComposableAdvisor {
    public static void main(String[] args) {
        String configPath = "ch06/com/baobaotao/advisor/beans.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(configPath);
        Waiter waiter = (Waiter) ctx.getBean("waiter4");
        WaiterDelegate wd = new WaiterDelegate();
        wd.setWaiter(waiter);
        waiter.serveTo("Peter");
        waiter.greetTo("Peter");
        wd.service("Peter");
    }
}
