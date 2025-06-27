
public class BinaryConverter implements BaseConverter {
    @Override
    public String convert(int asciiValue) {
        if (asciiValue == 0) return "0";
        String result = "";
        while (asciiValue > 0) {
            result = (asciiValue % 2) + result;
            asciiValue /= 2;
        }
        return result;
    }

    @Override
    public String getBaseName() {
        return "binary";
    }
}
