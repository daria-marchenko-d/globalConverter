public class HexadecimalConverter implements BaseConverter {
    @Override
    public String convert(int asciiValue) {
        if (asciiValue == 0) return "0";
        String hexChars = "0123456789ABCDEF";
        String result = "";
        while (asciiValue > 0) {
            int remainder = asciiValue % 16;
            result = hexChars.charAt(remainder) + result;
            asciiValue /= 16;
        }
        return result;
    }

    @Override
    public String getBaseName() {
        return "hexadecimal";
    }
}
