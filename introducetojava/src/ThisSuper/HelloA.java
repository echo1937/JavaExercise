package ThisSuper;

/**
 * Created by Eric on 12/17/2015.
 */
public class HelloA {
    public static void main(String[] args) {
        A aaa = new A();
        aaa.print();
        B bbb = new B(aaa);
        bbb.print();
    }
}
