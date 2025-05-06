import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        DoConversion();
        boolean a = false;
        do {
            Scanner input = new Scanner(System.in);
            try {
                System.out.println("Do you have another measurement you would like to convert? true or false");

                Boolean yesOrNo = input.nextBoolean();

                if (yesOrNo == true) {
                    doConversion();
                } else if (yesOrNo == false) {
                    System.out.println("Have a good day");
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Answer must be true or false");
                System.out.println("Do you have another measurement you would like to convert?");
                Boolean yesOrNo = input.nextBoolean();
            }
        } while (!a);

    }

    private static void doConversion() {
        System.out.println("Is the measurement in cups or liters?");
        Scanner input = new Scanner(System.in);
        String measurementType = input.nextLine();
        Double d = 4.22675284;
        float conversionNumber = d.floatValue();
        if (measurementType.equalsIgnoreCase("cups")) {
            System.out.println("How many cups?");
            Float cupsAmount = input.nextFloat();
            Float cupsToLitersAmount = cupsAmount / conversionNumber;
            System.out.println(cupsAmount + " Cups is " + cupsToLitersAmount + " Liters");
        } else if (measurementType.equalsIgnoreCase("liters")) {
            System.out.println("How many liters?");
            Float litersAmount = input.nextFloat();
            Float litersToCupsAmount = litersAmount / conversionNumber;
            System.out.println(litersAmount + " Liters is " + litersToCupsAmount + " Cups");
        } else {
            System.out.println("Measurement type must be cups or liters.");
            doConversion();
        }
    }
}
