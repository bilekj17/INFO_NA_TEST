package Ukol3;

public class LenPolicy implements PasswordPolicy {

    protected int value;
    public LenPolicy(int value) {
        this.value = value;
    }

    @Override
    public boolean okey(String password) {
        if(password.length() >= value){
            return true;
        }
        return false;
    }
}
