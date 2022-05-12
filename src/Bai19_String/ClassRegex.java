package Bai19_String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassRegex {
    private static final String CLASS_REGEX = "[CAP][0-9]{4}[GHIKLM]";

    public ClassRegex() {
    }

    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(CLASS_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static void main(String[] args) {
        ClassRegex classRegex = new ClassRegex();
        System.out.println("Class C0318G valid: " + classRegex.validate("C0318G"));;
        System.out.println("Class M0318G invalid: " + classRegex.validate("M0318G"));;
        System.out.println("Class P0323A invalid: " + classRegex.validate("P0323A"));;
    }
}
