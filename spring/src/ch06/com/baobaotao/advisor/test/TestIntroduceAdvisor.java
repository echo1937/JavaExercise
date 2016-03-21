package ch06.com.baobaotao.advisor.test;

import ch06.com.baobaotao.introduce.ForumService;
import ch06.com.baobaotao.introduce.Monitorable;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIntroduceAdvisor {
    public static void main(String[] args) {
        String configPath = "ch06/com/baobaotao/advisor/beans.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(configPath);
        ForumService forumService = (ForumService) ctx.getBean("forumService");
        forumService.removeForum(10);
        Monitorable moniterable = (Monitorable) forumService;
        moniterable.setMonitorActive(true);
        forumService.removeForum(10);
    }
}
