package ThisSuper;

/**
 * Created by Eric on 12/17/2015.
 */
public class B {
    A a;

    public B(A a) {
        this.a = a;
    }

    public void print() {
        a.print();//调用A的方法
        System.out.println("HelloAB from B!");
    }
}
