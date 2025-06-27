public class DecimalConverter implements BaseConverter {
    @Override
    public String convert(int asciiValue) {
        // Manually converting an integer to a string
        if (asciiValue == 0) return "0";
        String result = "";
        int value = asciiValue;
        boolean isNegative = value < 0;
        if (isNegative) value = -value;
        while (value > 0) {
            result = (char)('0' + (value % 10)) + result;
            value /= 10;
        }
        if (isNegative) result = "-" + result;
        return result;
    }

    @Override
    public String getBaseName() {
        return "decimal";
    }
}