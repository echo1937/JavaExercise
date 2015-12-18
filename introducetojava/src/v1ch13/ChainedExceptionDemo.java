package v1ch13;

/**
 * Created by Eric on 12/18/2015.
 */
public class ChainedExceptionDemo {
    public static void main(String[] args) {
        try {
            method1();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void method1() throws Exception {
        try {
            method2();
        } catch (Exception ex) {
            //差异就在于抛出的新异常中包含了ex这个原异常
            throw new Exception("New info from method1", ex);
//            throw new Exception("New info from method1");

        }
    }

    public static void method2() throws Exception {
        throw new Exception("New info from method2");

    }
}
