package Ukol2;

public class BasePrice implements Price {
    private double basePrice;

    public BasePrice(double baseprice) {
        this.basePrice = baseprice;
    }

    @Override
    public double getTotal() {
        return basePrice;
    }

}
