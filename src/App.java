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
                System.out.println("Erreur : La chaîne ne doit contenir que des lettres et des chiffres.");
                continue; // 'continue' skips directly to the next iteration of the loop.
            }

            System.out.println("Entrez la base de destination (ex:  hexadecimal, octal, decimal, binary, text) :");
            String targetBase = scanner.nextLine();

            //For now, we are just displaying what we have received.
            System.out.println("Chaîne saisie :'" + inputString + "'");
            System.out.println("Base choisie : '" + targetBase + "'");

            // ---- WE WILL ADD THE CONVERSION LOGIC LATER HERE ----
        }

        // Close the scanner to free up resources. 
        scanner.close();
        System.out.println("Programme terminé.");
    }  
}
