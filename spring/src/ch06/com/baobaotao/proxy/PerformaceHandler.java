package ch06.com.baobaotao.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class PerformaceHandler implements InvocationHandler {
    private Object target;

    public PerformaceHandler(Object target) {
        this.target = target;
    }
    // what is "target"? -- ForumService target = new ForumServiceImpl();

    // 实现接口方法,入参为:
    // proxy 最终生成的代理实例
    // method 被代理目标实例的某个具体方法
    // args 传给被代理实例某一个方法的入参数组
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        PerformanceMonitor.begin(target.getClass().getName() + "." + method.getName());
        Object obj = method.invoke(target, args);
        PerformanceMonitor.end();
        return obj;
    }
}
