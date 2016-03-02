package ch06.com.baobaotao.proxy;

import java.lang.reflect.Proxy;

public class TestForumService {
    public static void main(String[] args) {
        // 业务类正常编码的测试
        // ForumService forumService = new ForumServiceImpl();
        // forumService.removeForum(10);
        // forumService.removeTopic(1012);

        // 使用JDK动态代理
        // 得到一个ForumServiceImpl实例,记为target,这是业务实例.
        ForumService target = new ForumServiceImpl();

        // 将 target 实例传入PerformaceHandler的构造函数,
        // 得到一个handler对象,属性handler.target=target(对象),
        // 并且handler实现了invoke方法,实现了业务逻辑和横切逻辑的编织.
        // PerformaceHandler内部是编织target(ForumServiceImpl)和PerformaceMonitor的场所.
        PerformaceHandler handler = new PerformaceHandler(target);


        // 出现了Proxy的静态方法newProxyInstance动态创建一个符合某一接口的实例,生成目标类的代理对象.
        // 传入参数为: 类加载器,代理实例需要实现的接口,整合了业务逻辑和横切逻辑的编织器对象.
        ForumService proxy = (ForumService) Proxy.newProxyInstance(
                target.getClass().getClassLoader(), target.getClass().getInterfaces(), handler);

        // 使用代理实例来调用方法.
        proxy.removeForum(10);
        proxy.removeTopic(1012);

    }
}
