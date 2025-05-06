import java.util.InputMismatchException;
import java.util.Scanner;

// public class conversion;
// public static void main(String[] args) throws Exception {
//     Scanner input = new Scanner(System.in);
//     System.out.println("Is the measurement in cups or liters?");
//     String measurementType = input.nextLine();
//     Double d = 4.22675284;
//     float conversionNumber = d.floatValue();
//     if (measurementType.equalsIgnoreCase("cups")) {
//         System.out.println("How many cups?");
//         Float cupsAmount = input.nextFloat();
//         Float cupsToLitersAmount = cupsAmount / conversionNumber;
//         System.out.println(cupsAmount + " Cups is " + cupsToLitersAmount + " Liters");
//     } else if (measurementType.equalsIgnoreCase("liters")) {
//         System.out.println("How many liters?");
//         Float litersAmount = input.nextFloat();
//         Float litersToCupsAmount = litersAmount / conversionNumber;
//         System.out.println(litersAmount + " Liters is " + litersToCupsAmount + " Cups");
//     } else {
//         System.out.println("Measurement type must be cups or liters.");
//         System.out.println("Is the measurement in cups or liters?");
//         measurementType = input.nextLine();
//     }
// }

public class App {
    
        boolean a = false;{
        do {
            Scanner b = new Scanner(System.in);
            try {
                System.out.println("Do you have another measurement you would like to convert? true or false");

                Boolean yesOrNo = b.nextBoolean();

                if (yesOrNo == true) {
                    continue conversion;
                    
                } else if (yesOrNo == false) {
                    System.out.println("Have a good day");
                }
            } catch (InputMismatchException e) {
                System.out.println("Answer must be true or false");
                System.out.println("Do you have another measurement you would like to convert?");
                Boolean yesOrNo = b.nextBoolean();
            }
        } while (!a);

}
}


