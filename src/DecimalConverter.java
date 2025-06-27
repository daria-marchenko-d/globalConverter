public class DecimalConverter implements BaseConverter {
    @Override
    public String convert(int asciiValue) {
        return Integer.toString(asciiValue);
    }

    @Override
    public String getBaseName() {
        return "decimal";
    }
}