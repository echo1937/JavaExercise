package v1ch4;

import java.util.Scanner;

/**
 * Created by Eric on 8/27/2014.
 */
public class Exercise4_26 {
    public static void main(String[] args){

        double item=1.0;
        double e=1.0;
        java.util.Scanner input=new Scanner(System.in);
        System.out.print("Enter the i: ");
        int i=input.nextInt();
        for (int a=1;a<=i;a++){
            item=item/a;
            e+=item    ;
        }
        System.out.println("e = "+e);

    }
}
