package Ukol2;

public class VatDecorator extends PriceDecorator {

    public VatDecorator(Price baseprice) {
        super(baseprice);
    }

    public double getTotal() {
        return BASE_PRICE.getTotal()*1.21;
    }
}
