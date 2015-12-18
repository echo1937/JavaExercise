package v1ch13;

/**
 * Created by Eric on 12/18/2015.
 */
public class TestException {
    public static void main(String[] args) {
        try {
            System.out.println(sum(new int[]{1, 2, 3, 4, 5}));
        } catch (Exception ex) {
            ex.printStackTrace();                           //打印红色跟踪信息
            System.out.println("\n" + ex.getMessage());     //这里输出错误的index下标5
            System.out.println("\n" + ex.toString());       //输出三个字符串的拼接

            System.out.println("\nTrace Info Obtained from getStackTrace");
            StackTraceElement[] traceElements = ex.getStackTrace();
            for (int i = 0; i < traceElements.length; i++) {
                System.out.println("Method" + traceElements[i].getMethodName());
                System.out.println("(" + traceElements[i].getClassName() + ":");
                System.out.println(traceElements[i].getLineNumber() + ")");
            }
        }
    }

    private static int sum(int[] list) {
        int result = 0;
        for (int i = 0; i <= list.length; i++) {
            result += list[i];
        }
        return result;
    }
}
