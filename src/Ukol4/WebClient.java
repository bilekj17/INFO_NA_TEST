package Ukol4;

public class WebClient implements Observer{
    public void onNews(String h){
        System.out.println("WEB: " + h);
    }
}
