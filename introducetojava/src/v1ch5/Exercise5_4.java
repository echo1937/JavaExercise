package v1ch5;

import java.util.Scanner;

/**
 * Created by Eric on 4/8/15.
 */
public class Exercise5_4 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int value=input.nextInt();

        System.out.print("The reverse number for "+value+" is ");
        reverse(value);
    }

    public static void reverse(int number){

        while (number!=0){
            int remainder=number%10;
            System.out.print(remainder);
            number=number/10;
        }

    }

}
