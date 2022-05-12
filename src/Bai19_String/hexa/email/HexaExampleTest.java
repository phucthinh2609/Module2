package Bai19_String.hexa.email;

public class HexaExampleTest {
    private static HexaExample emailExample;
    public static String[] validHexa = {"a@gmail.com", "ab@yahoo.com", "abc@hotmail.com"};
    public static String[] invalidHexa = {"@gmail.com", "ab@gmail.", "@#abc@gmail.com"};

    public static void main(String[] args) {
        emailExample = new HexaExample();
        for (String email : validHexa){
            boolean isValid = emailExample.validate(email);
            System.out.println("Email " + email + " is valid: " + isValid);
        }
        for (String email: invalidHexa){
            boolean isInvalid = emailExample.validate(email);
            System.out.println("Email " + email + " is invalid: " + isInvalid);
        }
    }
}
