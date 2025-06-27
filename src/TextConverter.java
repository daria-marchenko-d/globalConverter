public class TextConverter implements BaseConverter {
    @Override
    public String convert(int asciiValue) {
        return Character.toString((char) asciiValue);
    }

    @Override
    public String getBaseName() {
        return "text";
    }
}