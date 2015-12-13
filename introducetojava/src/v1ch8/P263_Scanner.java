package v1ch8;

import java.io.File;
import java.util.Scanner;

/**
 * Created by Eric on 12/13/15.
 */
public class P263_Scanner {
    public static void main(String[] args) throws Exception{
//        Scanner input = new Scanner(
//                new File("/Users/Eric/Documents/IdeaProjects/MyJavaExercise/introducetojava/src/v1ch8/test.txt"));
        Scanner input = new Scanner(System.in);

        System.out.println("here is [" + input.nextInt() + "]");
        System.out.println("another is [" + input.nextLine() + "]");
//        System.out.println("third is [" + input.nextLine() + "]");

    }
}
