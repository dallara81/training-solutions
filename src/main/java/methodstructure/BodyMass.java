package methodstructure;

import java.util.Scanner;

public class BodyMass {

    // BMI-kategóriák
    // underweight 18.5 <-normal-> 25.0 overweight
    public static String bmiCategory(double weight,
                                     double height) {

        // A BMI-érték kiszámítása
        double bmi = weight / ( height * height) ;

        // BMI-kategóriák ellenőrzése a kapott értékre
        if(bmi < 18.5)
            return "Underweight";
        else if(bmi < 25)
            return "Normal";
        else
            return "Overweight";
    }

    public static void main(String[] args) {

        // Szükséges változók deklarálása
        double weightInKg = 0.0f;
        double heightInMeters = 0.0f;
        String result = null;

        // Scanner az adatok beolvasásához
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your weight (in kilograms): ");
        weightInKg = scan.nextDouble();
        System.out.print("Enter your height (in meters): ");
        heightInMeters = scan.nextDouble();

        // A BMI-index kiszámítása
        result = bmiCategory( weightInKg,
                heightInMeters );

        // Az eredmény kiírása
        System.out.println(result);

        // Zárjuk is le ezt a sz@rt.
        scan.close();
    }
}
