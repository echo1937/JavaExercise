package v1ch11;

/**
 * Created by Eric on 12/15/2015.
 */
public class Hello {
    String s = "Hello";

    public Hello(String s) {
        System.out.println("s = " + s);
        System.out.println("1 -> this.s = " + this.s);
        this.s = s;//把参数值赋给成员变量，成员变量的值改变
        System.out.println("2 -> this.s = " + this.s);
    }

    public static void main(String[] args) {
        Hello x = new Hello("HelloWorld!");
        System.out.println("s = " + x.s);//验证成员变量值的改变
    }
}
