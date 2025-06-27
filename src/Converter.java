import java.util.*;

public class Converter {
    private List<BaseConverter> converters = new ArrayList<>();

    public Converter() {
        converters.add(new BinaryConverter());
        converters.add(new OctalConverter());
        converters.add(new HexadecimalConverter());
        converters.add(new DecimalConverter());
        converters.add(new TextConverter());
    }

    public String convertFromText(String text, String targetBase) {
        BaseConverter converter = null;
        for (BaseConverter c : converters) {
            if (c.getBaseName().equalsIgnoreCase(targetBase)) {
                converter = c;
                break;
            }
        }
        if (converter == null) return "Conversion non supportée";

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            int asciiValue = (int) text.charAt(i);
            result.append(converter.convert(asciiValue)).append(" ");
        }
        return result.toString().trim();
    }
}