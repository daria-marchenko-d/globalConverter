public class Converter {

    /**
     * Convert a number in base 10 (decimal) to its binary representation (base 2).
     * @param decimal The number to be converted.
     * @return A string representing the number in binary.
     */
    private String decimalToBinary(int decimal) {
        if (decimal == 0) {
            return "0";
        }

        String binaryResult = ""; // We'll build our result here.

        // Conversion algorithm: division by 2
        // As long as n is not 0...
        while (decimal > 0) {
            int remainder = decimal % 2; // ...we calculate the remainder of the division by 2 (either 0 or 1)
            binaryResult = remainder + binaryResult; // ...we add this remainder to the START of our chain
            decimal = decimal / 2; // ...we divide the number by 2 for the next iteration
        }

        return binaryResult;
    }

    // Convert decimal to hexadecimal (without using Integer.toHexString)
    private String decimalToHexadecimal(int decimal) {
        if (decimal == 0) {
            return "0";
        }
        String hexChars = "0123456789ABCDEF";
        String hexResult = "";
        while (decimal > 0) {
            int remainder = decimal % 16;
            hexResult = hexChars.charAt(remainder) + hexResult;
            decimal = decimal / 16;
        }
        return hexResult;
    }

    // Convert decimal to octal (without using Integer.toOctalString)
    private String decimalToOctal(int decimal) {
        if (decimal == 0) {
            return "0";
        }
        String octalResult = "";
        while (decimal > 0) {
            int remainder = decimal % 8;
            octalResult = remainder + octalResult;
            decimal = decimal / 8;
        }
        return octalResult;
    }

    /**
     * Main method for converting a text string to another base.
     * Currently, it only supports conversion to binary.
     * @param text The character string to be converted.
     * @param targetBase The destination base (‘binary’, ‘octal’, etc.).
     * @return The result of the conversion.
     */
    public String convertFromText(String text, String targetBase) {
        String finalResult = "";

        //Check if the base is supported
        if (
            !targetBase.equalsIgnoreCase("binary") &&
            !targetBase.equalsIgnoreCase("octal") &&
            !targetBase.equalsIgnoreCase("decimal") &&
            !targetBase.equalsIgnoreCase("hexadecimal") &&
            !targetBase.equalsIgnoreCase("text")
        ) {
            return "Conversion non supportée";
        }

        // On parcourt chaque caractère du texte d'entrée
        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);
            // In Java, you can ‘cast’ a char to an int to obtain its ASCII value.
            int asciiValue  = (int) character;
            String convertedValue = "";

            if (targetBase.equalsIgnoreCase("binary")) {
                convertedValue = decimalToBinary(asciiValue);
            } else if (targetBase.equalsIgnoreCase("octal")) {
                convertedValue = decimalToOctal(asciiValue);
            } else if (targetBase.equalsIgnoreCase("decimal")) {
                convertedValue = Integer.toString(asciiValue);
            } else if (targetBase.equalsIgnoreCase("hexadecimal")) {
                convertedValue = decimalToHexadecimal(asciiValue);
            } else if (targetBase.equalsIgnoreCase("text")) {
                convertedValue = Character.toString(character);
            }

            finalResult += convertedValue + " "; // On ajoute la valeur convertie et un espace
        }

        return finalResult.trim(); // .trim() enlève l'espace en trop à la fin
    }
}
