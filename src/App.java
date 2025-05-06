// This program will convert the two main measurement types (Metric and Imperial), in liquid form.
//  For this exercise I chose cups and liters since they are one of the most common found in the two types of measurement.
//  It will also ask the user if they would like to do multiple conversions if they so choose.

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Runs the two methods doConversion and goAgain
        doConversion();
        goAgain();
    }
    // Gains whether the user would like to convert again
    public static void goAgain() {
        boolean a = false;
        do {
            Scanner input = new Scanner(System.in);
            try {
                // Asks the user if they would like to make another conversion
                System.out.println("Do you have another measurement you would like to convert? true or false");

                Boolean yesOrNo = input.nextBoolean();
                // If user would like to convert again, runs doCOnversion again
                if (yesOrNo == true) {
                    doConversion();
                // If user doesn't want to go again, says goodbye and breaks
                } else if (yesOrNo == false) {
                    System.out.println("Have a good day");
                    break;
                }
            // If user makes a typo, prints acceptable answers and runs goAgain
            } catch (InputMismatchException e) {
                System.out.println("Answer must be true or false");
                goAgain();
            }
        } while (!a);
    }

    // Converts cups and liters to one another
    private static void doConversion() {
        // Asks user if they are using cups or liters
        System.out.println("Is the measurement in cups or liters?");
        Scanner input = new Scanner(System.in);
        String measurementType = input.nextLine();
        // Conversion number between cups and liters
        Double d = 4.22675284;
        float conversionNumber = d.floatValue();
        // If answer cups, asks how many cups and prints how many liters it is
        if (measurementType.equalsIgnoreCase("cups")) {
            System.out.println("How many cups?");
            Float cupsAmount = input.nextFloat();
            Float cupsToLitersAmount = cupsAmount / conversionNumber;
            System.out.println(cupsAmount + " Cups is " + cupsToLitersAmount + " Liters");
        // If answer is liters, asks how many liters and prints how many cups that is
        } else if (measurementType.equalsIgnoreCase("liters")) {
            System.out.println("How many liters?");
            Float litersAmount = input.nextFloat();
            Float litersToCupsAmount = litersAmount / conversionNumber;
            System.out.println(litersAmount + " Liters is " + litersToCupsAmount + " Cups");
        //  If user makes a typo or measurement not allowed (ex. milliliters). prints acceptable answers and runs doConversion
        } else {
            System.out.println("Measurement type must be cups or liters.");
            doConversion();
        }
    }
}
