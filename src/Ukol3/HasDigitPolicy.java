package Ukol3;

public class HasDigitPolicy implements PasswordPolicy {
    @Override
    public boolean okey(String password) {
        if (password.replaceAll("[^0-9]", "").isBlank()){
            return false;
        }
        return true;
    }
}
