interface Image {
    void display();
}
class RealImage implements Image {
    String file;
    RealImage(String f) {
        file = f;
        System.out.println("Loading " + file);
    }
    public void display() { System.out.println("Showing " + file); }
}
class ProxyImage implements Image {
    String file;
    RealImage real;
    ProxyImage(String f) { file = f; }
    public void display() {
        if (real == null) real = new RealImage(file);
        real.display();
    }
}
public class Main {
    public static void main(String[] args) {
        Image img = new ProxyImage("dog.jpg");
        img.display();
    }
}