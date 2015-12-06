package v1ch3;

/**
 * Created by Eric on 12/6/15.
 */
public class Switch_P75 {
    public static void main(String[] args) {
        System.out.println("Welcome to Java!");

        char ch = 'b';
        switch (ch) {
            case 'a':
                System.out.println(ch);
            case 'b':
                System.out.println(ch);
            case 'c':
                System.out.println(ch);
        }

        System.out.printf("This Number is %.2f\n", 1.0);
//        System.out.println("This Number is %.2f", 1.0);
        char a = '汉';
        char b = '字';
        int c = 'A' + 1;
        System.out.println((char) c);
        System.out.println(c);
        System.out.println(a > b);

    }
}
