package Bai19_String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneRegex {
    private static final String PHONE_REGEX = "\\(\\d{2}\\)-\\(\\d{10}\\)";

    public PhoneRegex() {
    }

    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(PHONE_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static void main(String[] args) {
        PhoneRegex phoneRegex = new PhoneRegex();
        System.out.println("Phone (84)-(0978489648) valid: " + phoneRegex.validate("(84)-(0978489648)"));;
        System.out.println("Phone (a8)-(22222222) invalid: " + phoneRegex.validate("(a8)-(22222222)"));;
    }
}
