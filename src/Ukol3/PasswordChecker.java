package Ukol3;

public class PasswordChecker {
    private PasswordPolicy policy;
    public PasswordChecker(PasswordPolicy policy) {
        this.policy = policy;
    }

    public void setPolicy(PasswordPolicy policy) {
        this.policy = policy;
    }

    public boolean check(String password) {
        return policy.okey(password);
    }
}
