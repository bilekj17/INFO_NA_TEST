package Ukol2;

public class Main2 {
    public static void main(String[] args) {
        Price price = new VatDecorator(new BasePrice(20));

        System.out.println(price.getTotal());

        Price price2 = new DiscountDecorator(new BasePrice(20));

        System.out.println(price2.getTotal());
    }
}
