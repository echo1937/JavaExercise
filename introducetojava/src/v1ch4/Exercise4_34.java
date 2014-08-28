package v1ch4;

import java.util.Scanner;

/**
 * Created by Eric on 8/28/2014.
 */
public class Exercise4_34 {
    public static void main(String[] args) {
        int count = 0;

        while (count <= 2 && count >= -2) {
            int computerNumber = (int) (Math.random() * 3);

            Scanner input = new Scanner(System.in);
            System.out.print("scissor(0),rock(1),paper(2): ");
            int userNumber = input.nextInt();

            switch (computerNumber) {
                case 0:
                    if (userNumber == 0) System.out.print("This is draw");
                    else if (userNumber == 1) {
                        System.out.print("You won!");
                        count++;
                    } else if (userNumber == 2) {
                        System.out.print("You lost");
                        count--;
                    }
                    break;
                case 1:
                    if (userNumber == 0) {
                        System.out.print("you lost");
                        count--;
                    } else if (userNumber == 1) System.out.print("This is draw");
                    else if (userNumber == 2) {
                        System.out.print("You won!");
                        count++;
                    }
                    break;
                case 2:
                    if (userNumber == 0) {
                        System.out.print("you won");
                        count++;
                    } else if (userNumber == 2) System.out.print("This is draw");
                    else if (userNumber == 1) {
                        System.out.print("You lost!");
                        count--;
                    }
                    break;
            }
        System.out.println("\nThe computerNumber is: "+computerNumber);
        }
        if (count > 2) System.out.println("You won more than two times");
        else System.out.println("The comupter won more than two times");

    }

}
