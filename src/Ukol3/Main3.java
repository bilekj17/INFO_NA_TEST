package Ukol3;

public class Main3 {
    public static void main(String[] args) {
        PasswordChecker c = new PasswordChecker(new LenPolicy(8));
        System.out.println(c.check("123456"));

        PasswordChecker c2 = new PasswordChecker(new HasDigitPolicy());
        System.out.println(c2.check("123456"));
    }
}
