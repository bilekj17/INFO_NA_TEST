package Ukol2;

public class DiscountDecorator extends PriceDecorator {
    public DiscountDecorator(Price price) {
        super(price);
    }

    public double getTotal() {
        return BASE_PRICE.getTotal()*0.90;
    }
}
