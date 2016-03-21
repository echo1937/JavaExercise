package ch06.com.baobaotao.advisor;

import org.springframework.aop.Pointcut;
import org.springframework.aop.support.ComposablePointcut;
import org.springframework.aop.support.ControlFlowPointcut;
import org.springframework.aop.support.NameMatchMethodPointcut;

public class GreetingComposablePointcut {
    public Pointcut getIntersectionPointcut() {
        Pointcut pt1 = new ControlFlowPointcut(WaiterDelegate.class, "service");
        NameMatchMethodPointcut pt2 = (new NameMatchMethodPointcut()).addMethodName("greetTo");
        return new ComposablePointcut().intersection(pt1).intersection((Pointcut) pt2);
    }
}
