package Ukol4;

public class MobileClient implements Observer{
    public void onNews(String h){
        System.out.println("MOBILE: " + h);
    }
}
