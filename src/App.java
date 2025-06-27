import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Creates a Scanner object to read user input.
        Scanner scanner = new Scanner(System.in);

        // Infinite loop so that the program continues to request conversions
        while (true) {
            System.out.println("\nEntrez la chaîne de caractère à convertir (ou 'Q' pour arrêter) :");
            String inputString = scanner.nextLine();

            //Condition for exiting the loop 
            if (inputString.equalsIgnoreCase("Q")) {
                break;
            }

            // We call our validation method .
            if (!Validator.isAlphanumeric(inputString)) {
                System.out.println("Erreur : La chaîne ne doit contenir que des lettres, des chiffres ou des espaces.");
                continue; // 'continue' skips directly to the next iteration of the loop.
            }

            System.out.println("Choisissez la base de destination :");
            System.out.println(" h : hexadecimal");
            System.out.println(" o : octal");
            System.out.println(" d : decimal");
            System.out.println(" b : binary");
            System.out.println(" t : text");
            String targetBase = scanner.nextLine();

            // Converting abbreviated options to full names
            switch (targetBase) {
                case "h":
                targetBase = "hexadecimal";
                break;
                case "o":
                targetBase = "octal";
                break;
                case "d":
                targetBase = "decimal";
                break;
                case "b":
                targetBase = "binary";
                break;
                case "t":
                targetBase = "text";
                break;
            }

             // We create a Converter object so that we can use its methods.
            Converter converter = new Converter();
            // The conversion method is called::
            String result = converter.convertFromText(inputString, targetBase);

            System.out.println("Résultat : " + result);

            // ---- WE WILL ADD THE CONVERSION LOGIC LATER HERE ----
        }

        // Close the scanner to free up resources. 
        scanner.close();
        System.out.println("Programme terminé.");
    }  
}
