package ch06.com.baobaotao.proxy;

/**
 * Created by Eric on 3/2/16.
 */
public class TestForumServiceByCGLib {
    public static void main(String[] args) {

        //使用CGLib动态代理
        CglibProxy proxy = new CglibProxy();
        ForumService forumService = (ForumService) proxy.getProxy(ForumServiceImpl.class);
        forumService.removeForum(10);
        forumService.removeTopic(1023);

    }
}
