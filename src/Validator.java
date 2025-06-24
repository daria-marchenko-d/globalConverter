public class Validator {

    /**
     * Checks whether a string contains only alphanumeric characters.
     * An alphanumeric character is a letter (a-z, A-Z) or a number (0-9).
     * @param text The string to be checked.
     * @return true if the string is valid, false otherwise.
     */
    public static boolean isAlphanumeric(String text) {
        // We go through each character in the string
        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);

            // Check if the character is NOT a lowercase letter,
            //NOT an uppercase letter, AND NOT a digit.
            boolean isLetter = (character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z');
            boolean isDigit = (character >= '0' && character <= '9');
            
            if (!isLetter && !isDigit) {
                return false; // If a single invalid character is found, the process is stopped and false is returned.
            }
        }
        return true; //If all characters have been checked and no invalid characters have been found, the string is valid.
    }
    
}
