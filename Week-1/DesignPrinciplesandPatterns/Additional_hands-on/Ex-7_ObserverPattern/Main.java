import java.util.List;
import java.util.ArrayList;
interface Observer {
    void update(String stock, double price);
}
interface Stock {
    void register(Observer o);
    void notifyObservers();
}
class StockMarket implements Stock {
    List<Observer> list = new ArrayList<>();
    String stock;
    double price;
    public void setStock(String s, double p) {
        stock = s;
        price = p;
        notifyObservers();
    }
    public void register(Observer o) { list.add(o); }
    public void notifyObservers() {
        for (Observer o : list) o.update(stock, price);
    }
}
class MobileApp implements Observer {
    public void update(String stock, double price) {
        System.out.println(stock + " -> " + price);
    }
}
public class Main {
    public static void main(String[] args) {
        StockMarket m = new StockMarket();
        m.register(new MobileApp());
        m.setStock("TCS", 3500);
    }
}