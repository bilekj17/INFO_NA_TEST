package Ukol4;

public class NewsAgency{
    private final java.util.List<Observer> obs = new java.util.ArrayList<>();
    public void add(Observer o){
        obs.add(o);
    }
    public void remove(Observer o){
        obs.remove(o);
    }
    public void publish(String headline){
        for (Observer o : obs)
            o.onNews(headline);
    }
}
