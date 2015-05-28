package v1ch2;

import java.util.Scanner;

/**
 * Created by Eric on 5/28/2015.
 */
public class Exercise2_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius of the cylinder: ");
        double radius = input.nextDouble();

        System.out.println("Enter length of the cylinder:");
        double length = input.nextDouble();


        double volume = radius * radius * Math.PI * length;

        System.out.println("The volume of the cylinder is:\n" + volume);

    }

}
