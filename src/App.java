import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Is the measurement in cups or liters?");
        String measurementType = input.nextLine();
        Double d = 4.22675284;
        float conversionNumber = d.floatValue();
        while (measurementType == "cups") {
           System.out.println("How many cups?"); 
           Float cupsAmount = input.nextFloat();
           Float cupsToLitersAmount = cupsAmount / conversionNumber;
           System.out.println(cupsAmount + "Cups is" + cupsToLitersAmount + " Liters");
        while (measurementType == "liters") {
        System.out.println("How many liters?"); 
           Float litersAmount = input.nextFloat();
           Float litersToCupsAmount = litersAmount / conversionNumber;
           System.out.println(cupsAmount + "Liters is" + litersToCupsAmount + " Cups");
        }


        
           
        }
    }
}
