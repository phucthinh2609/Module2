package Bai19_String.account;

public class AccountExampleTest {
    private static AccountExample accountExample;
    private static final String[] validAccount = {"123abc_", "_abc123", "______", "123456","abcdefgh"};
    private static final String[] invalidAccount = {".@", "12345", "1234_", "abcde"};

    public static void main(String[] args) {
        accountExample = new AccountExample();
        for (String account : validAccount){
            boolean isValid = accountExample.validate(account);
            System.out.println("Account "+account+" valid: " + isValid);
        }
        for (String account : invalidAccount){
            boolean isInvalid = accountExample.validate(account);
            System.out.println("Account " + account + " invalid: " + isInvalid);
        }
    }
}
