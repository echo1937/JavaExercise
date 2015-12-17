package ThisSuper;

/**
 * Created by Eric on 12/17/2015.
 */

public class HelloB {
    int i = 1;

    public HelloB() {
        Thread thread = new Thread() {
            public void run() {
                for (int j = 0; j < 20; j++) {
                    HelloB.this.run();//调用外部类的方法
                    try {
                        sleep(1000);
                    } catch (InterruptedException ie) {
                    }
                }
            }
        }; // 注意这里有分号
        thread.start();
    }

    public void run() {
        System.out.println("i = " + i);
        i++;
    }

    public static void main(String[] args) throws Exception {
        new HelloB();
    }
}