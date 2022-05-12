package Bai19_String.email;

public class EmailExampleTest {
    private static EmailExample emailExample;
    public static String[] validEmail = {"a@gmail.com", "ab@yahoo.com", "abc@hotmail.com"};
    public static String[] invalidEmail = {"@gmail.com", "ab@gmail.", "@#abc@gmail.com"};

    public static void main(String[] args) {
        emailExample = new EmailExample();
        for (String email : validEmail){
            boolean isValid = emailExample.validate(email);
            System.out.println("Email " + email + " is valid: " + isValid);
        }
        for (String email: invalidEmail){
            boolean isInvalid = emailExample.validate(email);
            System.out.println("Email " + email + " is invalid: " + isInvalid);
        }
    }
}
