package ch06.com.baobaotao.introduce;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestIntroduce {
    public static void main(String[] args) {
        String configPath = "ch06/com/baobaotao/introduce/beans.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(configPath);
        ForumService forumService = (ForumService) ctx.getBean("forumService");
        forumService.removeForum(10);
        forumService.removeTopic(1022);
        System.out.println();

        Monitorable moniterable = (Monitorable) forumService;
        moniterable.setMonitorActive(true);
        forumService.removeForum(10);
        forumService.removeTopic(1022);
    }
}
