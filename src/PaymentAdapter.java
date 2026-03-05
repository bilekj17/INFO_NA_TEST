public class PaymentAdapter implements PaymentGateway{
    private final OldPaymentGateway OLD;

    public PaymentAdapter(OldPaymentGateway old){
        this.OLD = old;
    }
    @Override
    public void pay(double amountEur) {
        OLD.payCzk((int)amountEur*25);
    }
}
