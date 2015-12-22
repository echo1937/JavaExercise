package v2;

import java.util.Scanner;

/**
 * Created by Eric on 12/22/2015.
 */
public class RadioInformation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rsNumber = input.nextInt();
        int readability = rsNumber / 10;
        int strength = rsNumber % 10;
        String result = "";

        switch (readability) {
            case 1:
                result = "Unreadable";
                break;
            case 2:
                result = "Barely readable, occasional words distinguishable";
                break;
            case 3:
                result = "Readable with considerable difficulty";
                break;
            case 4:
                result = "Readable with practically no difficulty";
                break;
            case 5:
                result = "Perfectly readable";

        }

        String temp = "";
        switch (strength) {
            case 1:
                temp = "Faint signals, barely perceptible";
                break;
            case 2:
                temp = "Very weak signals";
                break;
            case 3:
                temp = "Weak signals";
                break;
            case 4:
                temp = "Fair signals";
                break;
            case 5:
                temp = "Fairly good signals";
                break;
            case 6:
                temp = "Good signals";
                break;
            case 7:
                temp = "Moderately strong signals";
                break;
            case 8:
                temp = "Strong signals";
                break;
            case 9:
                temp = "Extremely strong signals";
                break;
        }
        result = temp + ", " + result.toLowerCase() + ".";
        System.out.println(result);

    }
}
