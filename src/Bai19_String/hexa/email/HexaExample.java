package Bai19_String.hexa.email;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HexaExample {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String HEXA_REGEX = "0[xX][0-9a-fA-F]+";

    public HexaExample() {
        pattern = Pattern.compile(HEXA_REGEX);
    }

    public boolean validate(String regex){
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
