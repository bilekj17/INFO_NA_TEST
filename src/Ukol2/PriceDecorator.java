package Ukol2;

public abstract class PriceDecorator implements Price{
    protected final Price BASE_PRICE;

    protected PriceDecorator(Price baseprice) {
        BASE_PRICE = baseprice;
    }
}
