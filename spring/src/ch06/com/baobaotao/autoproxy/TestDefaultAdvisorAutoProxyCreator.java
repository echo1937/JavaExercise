package ch06.com.baobaotao.autoproxy;

import ch06.com.baobaotao.advisor.Seller;
import ch06.com.baobaotao.advisor.Waiter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDefaultAdvisorAutoProxyCreator {
    public static void main(String[] args) {
        String configPath = "ch06/com/baobaotao/autoproxy/DefaultAdvisorAutoProxyCreator-beans.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(configPath);
        Waiter waiter = (Waiter) ctx.getBean("waiter");
        Seller seller = (Seller) ctx.getBean("seller");
        waiter.serveTo("John");
        waiter.greetTo("John");
        seller.greetTo("Tom");
    }
}
