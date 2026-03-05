package Ukol4;

public class Main4 {
    public static void main(String[] args) {
        NewsAgency newsAgency = new NewsAgency();

        newsAgency.add(new MobileClient());
        newsAgency.add(new WebClient());

        newsAgency.publish("WW3");
    }
}
