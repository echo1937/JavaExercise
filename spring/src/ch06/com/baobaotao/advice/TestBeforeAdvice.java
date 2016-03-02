package ch06.com.baobaotao.advice;

import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;

public class TestBeforeAdvice {
    public static void main(String[] args) {

        Waiter target = new NaiveWaiter();
        // 生成前置增强advice,它实现了MethodBeforeAdvice接口.
        BeforeAdvice advice = new GreetingBeforeAdvice();

        // 使用 spring 提供的代理工厂
        ProxyFactory pf = new ProxyFactory();

        // pf.setInterfaces(target.getClass().getInterfaces());
        // 启用代理优化,
        // pf.setOptimize(true);

        // 指定代理目标
        pf.setTarget(target);
        // 为代理目标添加增强,可以使用该方法添加多个增强 ,比如 addAdvice(int,Advice)
        pf.addAdvice(advice);

        // 类型转换,生成代理实例
        Waiter proxy = (Waiter) pf.getProxy();
        proxy.greetTo("John");
        proxy.serveTo("Tom");
    }
}
