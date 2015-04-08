package v1ch5;

import java.util.Scanner;

/**
 * Created by Eric on 4/8/15.
 */
public class Exercise5_2 {
    public static void main(String[] args){
        java.util.Scanner input= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int value=input.nextInt();

        System.out.print("The sum of digits for "+value+" is "+sumDigits(value));

    }

    public static int sumDigits(long n){
        int temp=(int)Math.abs(n);
        int sum=0;

//        while(temp!=0){
//            int remainder=temp%10;
//            sum+=remainder;
//            temp=temp/10;
//        }

          do {
              int remainder=temp%10;
              sum+=remainder;
              temp=temp/10;
          }while (temp!=0);



        return sum;
    }
}
