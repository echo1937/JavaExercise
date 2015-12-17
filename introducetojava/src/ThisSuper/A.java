package ThisSuper;

/**
 * Created by Eric on 12/17/2015.
 */
public class A {
    public A() {
        new B(this).print();// 调用B的方法
    }

    public void print() {
        System.out.println("HelloAA from A!");
    }
}
